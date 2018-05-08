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
 * Created by gonglu on 2018/5/4.
 */
@Service
public class TestVerWorklist {
    private  final  static Logger logger = LoggerFactory.getLogger(UniRisService.class);
    private static SimpleDateFormat sf= new SimpleDateFormat("yyyyMMddHHmmss");
    List<DataRow> dataRow = new LinkedList<DataRow>();
    @Autowired
    VerWorklistDao verWorklistDao;
    @Autowired
    ScheduleDao scheduleDao;
    @Autowired
    UniRisService uniRisService;

    public  Response getResponse(Request request) {
        return  uniRisService.getResponse(request);
    }
    public  DocInform getDocInform(){
        String accession_num = "E160314000140";
        DocInform docInform = scheduleDao.getDocInform(accession_num);
        return docInform;
    }
}
