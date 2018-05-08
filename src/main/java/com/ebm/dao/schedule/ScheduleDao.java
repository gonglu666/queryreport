package com.ebm.dao.schedule;

import com.ebm.model.schedule.DocInform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by gonglu on 2018/5/3.
 */

public interface ScheduleDao {
    @Select("select accession_num as reportId ,PATIENT_ID as patientID, accession_num as serialFlowNo, dept_name as  inceptDepartment, register_name as  inceptDoctor ,arrange as inceptTime,checkin as  inspectionTime from schedule where accession_num = #{accession_num}")
    public DocInform getDocInform(@Param(value="accession_num") String accession_num);
}
