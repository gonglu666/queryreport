
package com.ebm.model.pacsreport;

import com.sun.org.apache.regexp.internal.RE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


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
 *         &lt;element name="returnresult" type="{http://www.ebm.com/webservice}returnresult"/>
 *         &lt;element name="data" type="{http://www.ebm.com/webservice}data"/>
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
    "returnresult",
    "data"
})
@XmlRootElement(name = "response", namespace = "http://www.ebm.com/webservice")
public class Response {

    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected Returnresult returnresult;
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected Data data;

    /**
     * ��ȡreturnresult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Returnresult }
     *     
     */
    public Returnresult getReturnresult() {
        return returnresult;
    }

    /**
     * ����returnresult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Returnresult }
     *     
     */
    public void setReturnresult(Returnresult value) {
        this.returnresult = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    public static Response error(String errorMsg,List<DataRow> data_row){
        Response response = new Response();
        Data data = new Data();
        data.setData_row(data_row);
        response.setData(data);
        response.setReturnresult(Returnresult.error(errorMsg));
        return response;
    }
    public  static Response ok(List<DataRow> list){
        Response response = new Response();
        Data data = new Data();
        data.setData_row(list);
        response.setData(data);
        response.setReturnresult(Returnresult.ok("success"));
        return response;
    }



}
