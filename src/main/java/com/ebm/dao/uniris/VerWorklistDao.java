package com.ebm.dao.uniris;

import com.ebm.model.pacsreport.DataRow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by gonglu on 2018/5/3.
 */

public interface VerWorklistDao {
    @Select("select  accession_num as reportId , PATIENT_NAME as patientName," +
            "    patient_sex as patientSex," +
            "    patient_age as age," +
            "    '' as subHospitalID," +
            "    department as deptName," +
            "    patient_bed as bed," +
            "    perfrmd_item as itemName," +
            "    REPORT_START_DATE + REPORT_START_TIME as itemPara," +
            "    findings as itemDes," +
            "    impression as jcYj," +
            "    REQUEST_PHYSICIAN as giveInspectionDoctor," +
            "    REQUEST_DATE + REQUEST_TIME as giveInspectionTime," +
            "    '' as inceptDepartment, " +
            "    '' as inceptDoctor, " +
            "    '' as inceptTime, " +
            "    '' as inspectionTime, " +
            "    '' as inspectionResult, " +
            "    '' as resultUrl, " +
            "    '' as resultStream, " +
            "    REPORT_DOC_NAME as checkPerson, " +
            "    VERIFICATION_DATE+VERIFICATION_TIME as checkTime, " +
            "    findings as clinicalDiagnoses, " +
            "    REPORT_END_DATE+REPORT_END_TIME as requisitionTime, " +
            "    '1' as resultState, " +
            "    PRINT_COUNT as printCount, " +
            "    PATIENT_ID as patientID, " +
            "    '' as sampleType, " +
            "    '' as iDCode, " +
            "    CLINICAL_INFOR as note, " +
            "    PATIENT_SOURCE as source, " +
            "    PATIENT_LOCATION as inHosNum, " +
            "    accession_num as serialFlowNo, " +
            "    '' as location " +
            "    from VER_WORKLIST where PATIENT_ID = #{queryCode} " +
            "    and VERIFICATION_DATE + VERIFICATION_TIME >= #{startTime} " +
            "    and VERIFICATION_DATE + VERIFICATION_TIME <=#{endTime}" )
    public List<DataRow> getReportByID(@Param(value = "queryCode") String queryCode,
                                       @Param(value = "startTime") String startTime,
                                       @Param(value = "endTime") String endTime);

    @Select("select" +
            "    accession_num as reportId ," +
            "    PATIENT_NAME as patientName," +
            "    patient_sex as patientSex," +
            "    patient_age as age," +
            "    '' as subHospitalID," +
            "    department as deptName," +
            "    patient_bed as bed," +
            "    perfrmd_item as itemName," +
            "    REPORT_START_DATE + REPORT_START_TIME as itemPara," +
            "    findings as itemDes," +
            "    impression as jcYj," +
            "    REQUEST_PHYSICIAN as giveInspectionDoctor," +
            "    REQUEST_DATE + REQUEST_TIME as giveInspectionTime," +
            "    '' as inceptDepartment, " +
            "    '' as inceptDoctor, " +
            "    '' as inceptTime, " +
            "    '' as inspectionTime, " +
            "    '' as inspectionResult, " +
            "    '' as resultUrl, " +
            "    '' as resultStream, " +
            "    REPORT_DOC_NAME as checkPerson, " +
            "    VERIFICATION_DATE+VERIFICATION_TIME as checkTime, " +
            "    findings as clinicalDiagnoses, " +
            "    REPORT_END_DATE+REPORT_END_TIME as requisitionTime, " +
            "    '1' as resultState, " +
            "    PRINT_COUNT as printCount, " +
            "    PATIENT_ID as patientID, " +
            "    '' as sampleType, " +
            "    '' as iDCode, " +
            "    CLINICAL_INFOR as note, " +
            "    PATIENT_SOURCE as source, " +
            "    PATIENT_LOCATION as inHosNum, " +
            "    accession_num as serialFlowNo, " +
            "    '' as location " +
            "    from VER_WORKLIST where accession_num = #{queryCode} " +
            "    and VERIFICATION_DATE + VERIFICATION_TIME >= #{startTime} " +
            "    and VERIFICATION_DATE + VERIFICATION_TIME <=#{endTime}" )
    public List<DataRow> getReportByACCE(@Param(value = "queryCode") String queryCode,
                                       @Param(value = "startTime") String startTime,
                                       @Param(value = "endTime") String endTime);


}
