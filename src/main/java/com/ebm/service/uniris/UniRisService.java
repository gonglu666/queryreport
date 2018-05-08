package com.ebm.service.uniris;

import com.ebm.dao.schedule.ScheduleDao;
import com.ebm.dao.uniris.VerWorklistDao;
import com.ebm.model.pacsreport.DataRow;
import com.ebm.model.pacsreport.Request;
import com.ebm.model.pacsreport.Response;

import com.ebm.model.schedule.DocInform;
import com.ebm.service.common.StrFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by gonglu on 2018/5/3.
 */
@Service
public class UniRisService {
    private  final  static Logger logger = LoggerFactory.getLogger(UniRisService.class);
    private static  SimpleDateFormat sf= new SimpleDateFormat("yyyyMMddHHmmss");
    List<DataRow> dataRow = new LinkedList<DataRow>();
    @Autowired
    VerWorklistDao verWorklistDao;
    @Autowired
    ScheduleDao scheduleDao;

    public  Response getResponse(Request request) {
        String errorMsg = "";
        String queryCode, startTime, endTime;
        int queryType;
        try {
            queryCode = request.getQueryCode();
            queryType = request.getQueryType();
            startTime = request.getStartTime();
            endTime = request.getEndTime();
            if ((startTime == null || startTime.equals("")) && (endTime == null || endTime.equals(""))) {
                Date datetime = new Date();
                endTime = sf.format(datetime);
                startTime = "197001010000";
            } else {
                try {
                    startTime = StrFactory.getDateString(startTime);
                    endTime =  StrFactory.getDateString(endTime);
                } catch (Exception e) {
                    errorMsg = "日期转换出错，日期格式应为： yyyy-MM-dd HH:mm:ss";
                    logger.info(errorMsg);
                }

            }
            if (queryType == 1 || queryType == 2) {
                dataRow = verWorklistDao.getReportByID(queryCode, startTime, endTime);
            } else if (queryType == 3) {
                dataRow = verWorklistDao.getReportByACCE(queryCode, startTime, endTime);
            } else {
                errorMsg = "查询方式标识出错，查询方式标识只能为：1,2,3";
                logger.info(errorMsg);
            }
            if (dataRow.size() < 1) {
                errorMsg ="没有获取到资料信息";
                logger.info(errorMsg);
            } else {
                for (DataRow datarow:dataRow
                        ) {
                    DocInform docInform = scheduleDao.getDocInform(datarow.getReportId());
                    datarow.setInceptTime(docInform.getInceptTime()==null?" ":docInform.getInceptTime().substring(0,docInform.getInceptTime().length()-2));
                    datarow.setInceptDoctor(docInform.getInceptDoctor()==null?" ":docInform.getInceptDoctor());
                    datarow.setInceptDepartment(docInform.getInceptDepartment()==null?" ":docInform.getInceptDepartment());
                    datarow.setInspectionTime(docInform.getInspectionTime()==null?" ":docInform.getInspectionTime().substring(0,docInform.getInspectionTime().length()-2));
                    datarow.setItemPara(StrFactory.getDateFormat(datarow.getItemPara()));
                    datarow.setCheckTime(StrFactory.getDateFormat(datarow.getCheckTime()));
                    datarow.setRequisitionTime(StrFactory.getDateFormat(datarow.getRequisitionTime()));
                    datarow.setItemDes(StrFactory.getStr(datarow.getItemDes(),"\">","</"));
                    datarow.setJcYj(StrFactory.getStr(datarow.getJcYj(),"\">","</"));
                    datarow.setClinicalDiagnoses(StrFactory.getStr(datarow.getClinicalDiagnoses(),"\">","</"));
                }
            }
        } catch (Exception e) {
            //response
            logger.info(e.getMessage());
        }
        if(!errorMsg.equals("")){
            return Response.error(errorMsg,DataRow.nullData());
        }
        logger.info("数据查询成功");
        return  Response.ok(dataRow);
    }


}
