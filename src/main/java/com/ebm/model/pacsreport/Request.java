
package com.ebm.model.pacsreport;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QueryType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryCode",
    "queryType",
    "startTime",
    "endTime"
})
@XmlRootElement(name = "request", namespace = "http://www.ebm.com/webservice")
public class Request {

    @XmlElement(name = "QueryCode", namespace = "http://www.ebm.com/webservice", required = true)
    protected String queryCode;
    @XmlElement(name = "QueryType", namespace = "http://www.ebm.com/webservice", required = true)
    protected Integer queryType;
    @XmlElement(name = "StartTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String startTime;
    @XmlElement(name = "EndTime", namespace = "http://www.ebm.com/webservice", required = true)
    protected String endTime;

    /**
     * ��ȡqueryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryCode() {
        return queryCode;
    }

    /**
     * ����queryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryCode(String value) {
        this.queryCode = value;
    }

    /**
     * ��ȡqueryType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getQueryType() {
        return queryType;
    }

    /**
     * ����queryType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryType(Integer value) {
        this.queryType = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
