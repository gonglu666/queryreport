
package com.ebm.model.pacsreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.LinkedList;
import java.util.List;


/**
 * <p>data_row complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="data_row">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PatientSex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubHospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemPara" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemDes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JcYj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiveInspectionDoctor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiveInspectionTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InceptDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InceptDoctor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InceptTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InspectionTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InspectionResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultStream" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckPerson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClinicalDiagnoses" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequisitionTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultState" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PrintCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PatientID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SampleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InHosNum" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="SerialFlowNo" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_row", namespace = "http://www.ebm.com/webservice", propOrder = {
    "reportId",
    "patientName",
    "patientSex",
    "age",
    "subHospitalID",
    "deptName",
    "bed",
    "itemName",
    "itemPara",
    "itemDes",
    "jcYj",
    "giveInspectionDoctor",
    "giveInspectionTime",
    "inceptDepartment",
    "inceptDoctor",
    "inceptTime",
    "inspectionTime",
    "inspectionResult",
    "resultUrl",
    "resultStream",
    "checkPerson",
    "checkTime",
    "clinicalDiagnoses",
    "requisitionTime",
    "resultState",
    "printCount",
    "patientID",
    "sampleType",
    "idCode",
    "note",
    "source",
    "inHosNum",
    "serialFlowNo",
    "location"
})
public class DataRow {

    @XmlElement(name = "ReportId", namespace = "http://www.ebm.com/webservice", required = true)
    protected String reportId;
    @XmlElement(name = "PatientName", namespace = "http://www.ebm.com/webservice", required = true)
    protected String patientName;
    @XmlElement(name = "PatientSex", namespace = "http://www.ebm.com/webservice", required = true)
    protected String patientSex;
    @XmlElement(name = "Age", namespace = "http://www.ebm.com/webservice", required = true)
    protected String age;
    @XmlElement(name = "SubHospitalID", namespace = "http://www.ebm.com/webservice", required = true)
    protected String subHospitalID;
    @XmlElement(name = "DeptName", namespace = "http://www.ebm.com/webservice", required = true)
    protected String deptName;
    @XmlElement(name = "Bed", namespace = "http://www.ebm.com/webservice", required = true)
    protected String bed;
    @XmlElement(name = "ItemName", namespace = "http://www.ebm.com/webservice", required = true)
    protected String itemName;
    @XmlElement(name = "ItemPara", namespace = "http://www.ebm.com/webservice", required = true)
    protected String itemPara;
    @XmlElement(name = "ItemDes", namespace = "http://www.ebm.com/webservice", required = true)
    protected String itemDes;
    @XmlElement(name = "JcYj", namespace = "http://www.ebm.com/webservice", required = true)
    protected String jcYj;
    @XmlElement(name = "GiveInspectionDoctor", namespace = "http://www.ebm.com/webservice", required = true)
    protected String giveInspectionDoctor;
    @XmlElement(name = "GiveInspectionTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String giveInspectionTime;
    @XmlElement(name = "InceptDepartment", namespace = "http://www.ebm.com/webservice", required = true)
    protected String inceptDepartment;
    @XmlElement(name = "InceptDoctor", namespace = "http://www.ebm.com/webservice", required = true)
    protected String inceptDoctor;
    @XmlElement(name = "InceptTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String inceptTime;
    @XmlElement(name = "InspectionTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String inspectionTime;
    @XmlElement(name = "InspectionResult", namespace = "http://www.ebm.com/webservice", required = true)
    protected String inspectionResult;
    @XmlElement(name = "ResultUrl", namespace = "http://www.ebm.com/webservice", required = true)
    protected String resultUrl;
    @XmlElement(name = "ResultStream", namespace = "http://www.ebm.com/webservice", required = true)
    protected String resultStream;
    @XmlElement(name = "CheckPerson", namespace = "http://www.ebm.com/webservice", required = true)
    protected String checkPerson;
    @XmlElement(name = "CheckTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String checkTime;
    @XmlElement(name = "ClinicalDiagnoses", namespace = "http://www.ebm.com/webservice", required = true)
    protected String clinicalDiagnoses;
    @XmlElement(name = "RequisitionTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String requisitionTime;
    @XmlElement(name = "ResultState", namespace = "http://www.ebm.com/webservice", required = true)
    protected Integer resultState;
    @XmlElement(name = "PrintCount", namespace = "http://www.ebm.com/webservice", required = true)
    protected Integer printCount;
    @XmlElement(name = "PatientID", namespace = "http://www.ebm.com/webservice", required = true)
    protected String patientID;
    @XmlElement(name = "SampleType", namespace = "http://www.ebm.com/webservice", required = true)
    protected String sampleType;
    @XmlElement(name = "IDCode", namespace = "http://www.ebm.com/webservice", required = true)
    protected String idCode;
    @XmlElement(name = "Note", namespace = "http://www.ebm.com/webservice", required = true)
    protected String note;
    @XmlElement(name = "Source", namespace = "http://www.ebm.com/webservice", required = true)
    protected String source;
    @XmlElement(name = "InHosNum", namespace = "http://www.ebm.com/webservice", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String inHosNum;
    @XmlElement(name = "SerialFlowNo", namespace = "http://www.ebm.com/webservice", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String serialFlowNo;
    @XmlElement(name = "Location", namespace = "http://www.ebm.com/webservice", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String location;

    /**
     * ��ȡreportId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * ����reportId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * ��ȡpatientName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * ����patientName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientName(String value) {
        this.patientName = value;
    }

    /**
     * ��ȡpatientSex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSex() {
        return patientSex;
    }

    /**
     * ����patientSex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSex(String value) {
        this.patientSex = value;
    }

    /**
     * ��ȡage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * ��ȡsubHospitalID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubHospitalID() {
        return subHospitalID;
    }

    /**
     * ����subHospitalID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubHospitalID(String value) {
        this.subHospitalID = value;
    }

    /**
     * ��ȡdeptName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * ����deptName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * ��ȡbed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBed() {
        return bed;
    }

    /**
     * ����bed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBed(String value) {
        this.bed = value;
    }

    /**
     * ��ȡitemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * ����itemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * ��ȡitemPara���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPara() {
        return itemPara;
    }

    /**
     * ����itemPara���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPara(String value) {
        this.itemPara = value;
    }

    /**
     * ��ȡitemDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDes() {
        return itemDes;
    }

    /**
     * ����itemDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDes(String value) {
        this.itemDes = value;
    }

    /**
     * ��ȡjcYj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJcYj() {
        return jcYj;
    }

    /**
     * ����jcYj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJcYj(String value) {
        this.jcYj = value;
    }

    /**
     * ��ȡgiveInspectionDoctor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveInspectionDoctor() {
        return giveInspectionDoctor;
    }

    /**
     * ����giveInspectionDoctor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveInspectionDoctor(String value) {
        this.giveInspectionDoctor = value;
    }

    /**
     * ��ȡgiveInspectionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveInspectionTime() {
        return giveInspectionTime;
    }

    /**
     * ����giveInspectionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveInspectionTime(String value) {
        this.giveInspectionTime = value;
    }

    /**
     * ��ȡinceptDepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptDepartment() {
        return inceptDepartment;
    }

    /**
     * ����inceptDepartment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptDepartment(String value) {
        this.inceptDepartment = value;
    }

    /**
     * ��ȡinceptDoctor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptDoctor() {
        return inceptDoctor;
    }

    /**
     * ����inceptDoctor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptDoctor(String value) {
        this.inceptDoctor = value;
    }

    /**
     * ��ȡinceptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptTime() {
        return inceptTime;
    }

    /**
     * ����inceptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptTime(String value) {
        this.inceptTime = value;
    }

    /**
     * ��ȡinspectionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionTime() {
        return inspectionTime;
    }

    /**
     * ����inspectionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionTime(String value) {
        this.inspectionTime = value;
    }

    /**
     * ��ȡinspectionResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionResult() {
        return inspectionResult;
    }

    /**
     * ����inspectionResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionResult(String value) {
        this.inspectionResult = value;
    }

    /**
     * ��ȡresultUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultUrl() {
        return resultUrl;
    }

    /**
     * ����resultUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultUrl(String value) {
        this.resultUrl = value;
    }

    /**
     * ��ȡresultStream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultStream() {
        return resultStream;
    }

    /**
     * ����resultStream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultStream(String value) {
        this.resultStream = value;
    }

    /**
     * ��ȡcheckPerson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPerson() {
        return checkPerson;
    }

    /**
     * ����checkPerson���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPerson(String value) {
        this.checkPerson = value;
    }

    /**
     * ��ȡcheckTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTime() {
        return checkTime;
    }

    /**
     * ����checkTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTime(String value) {
        this.checkTime = value;
    }

    /**
     * ��ȡclinicalDiagnoses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalDiagnoses() {
        return clinicalDiagnoses;
    }

    /**
     * ����clinicalDiagnoses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalDiagnoses(String value) {
        this.clinicalDiagnoses = value;
    }

    /**
     * ��ȡrequisitionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionTime() {
        return requisitionTime;
    }

    /**
     * ����requisitionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionTime(String value) {
        this.requisitionTime = value;
    }

    /**
     * ��ȡresultState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultState() {
        return resultState;
    }

    /**
     * ����resultState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultState(Integer value) {
        this.resultState = value;
    }

    /**
     * ��ȡprintCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrintCount() {
        return printCount;
    }

    /**
     * ����printCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrintCount(Integer value) {
        this.printCount = value;
    }

    /**
     * ��ȡpatientID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * ����patientID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientID(String value) {
        this.patientID = value;
    }

    /**
     * ��ȡsampleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleType() {
        return sampleType;
    }

    /**
     * ����sampleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleType(String value) {
        this.sampleType = value;
    }

    /**
     * ��ȡidCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCode() {
        return idCode;
    }

    /**
     * ����idCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCode(String value) {
        this.idCode = value;
    }

    /**
     * ��ȡnote���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * ����note���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * ��ȡinHosNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHosNum() {
        return inHosNum;
    }

    /**
     * ����inHosNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHosNum(String value) {
        this.inHosNum = value;
    }

    /**
     * ��ȡserialFlowNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialFlowNo() {
        return serialFlowNo;
    }

    /**
     * ����serialFlowNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialFlowNo(String value) {
        this.serialFlowNo = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    public  static List<DataRow> error(){
        List<DataRow> data_row = new LinkedList<DataRow>();
        DataRow dataRow = new DataRow();
        dataRow.setReportId(" ");
        dataRow.setPatientName(" ");
        dataRow.setPatientSex(" ");
        dataRow.setAge(" ");
        dataRow.setSubHospitalID(" ");
        dataRow.setDeptName(" ");
        dataRow.setBed(" ");
        dataRow.setItemName(" ");
        dataRow.setItemPara(" ");
        dataRow.setItemDes(" ");
        dataRow.setJcYj(" ");
        dataRow.setGiveInspectionDoctor(" ");
        dataRow.setGiveInspectionTime(" ");
        dataRow.setInceptDepartment(" ");
        dataRow.setInceptDoctor(" ");
        dataRow.setInceptTime(" ");
        dataRow.setInspectionTime(" ");
        dataRow.setInspectionResult(" ");
        dataRow.setResultUrl(" ");
        dataRow.setResultStream(" ");
        dataRow.setCheckPerson(" ");
        dataRow.setCheckTime(" ");
        dataRow.setClinicalDiagnoses(" ");
        dataRow.setRequisitionTime(" ");
        dataRow.setResultState(0);
        dataRow.setPrintCount(1);
        dataRow.setPatientID(" ");
        dataRow.setSampleType(" ");
        dataRow.setIDCode(" ");
        dataRow.setNote(" ");
        dataRow.setSource(" ");
        dataRow.setInHosNum(" ");
        dataRow.setSerialFlowNo(" ");
        dataRow.setLocation(" ");
        data_row.add(dataRow);
        return data_row;
    }

    public  static List<DataRow> nullData(){
        List<DataRow> data_row = new LinkedList<DataRow>();
        DataRow dataRow = new DataRow();
        data_row.add(dataRow);
        return data_row;
    }

}
