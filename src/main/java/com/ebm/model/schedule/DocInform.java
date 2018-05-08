package com.ebm.model.schedule;

/**
 * Created by gonglu on 2018/5/3.
 */
public class DocInform {
    private  String reportId;
    private  String patientID;
    private  String serialFlowNo;
    private String inceptDepartment;
    private String inceptDoctor;
    private String inceptTime;
    private String inspectionTime;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getSerialFlowNo() {
        return serialFlowNo;
    }

    public void setSerialFlowNo(String serialFlowNo) {
        this.serialFlowNo = serialFlowNo;
    }

    public String getInceptDepartment() {
        return inceptDepartment;
    }

    public void setInceptDepartment(String inceptDepartment) {
        this.inceptDepartment = inceptDepartment;
    }

    public String getInceptDoctor() {
        return inceptDoctor;
    }

    public void setInceptDoctor(String inceptDoctor) {
        this.inceptDoctor = inceptDoctor;
    }

    public String getInceptTime() {
        return inceptTime;
    }

    public void setInceptTime(String inceptTime) {
        this.inceptTime = inceptTime;
    }

    public String getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
    }
}

