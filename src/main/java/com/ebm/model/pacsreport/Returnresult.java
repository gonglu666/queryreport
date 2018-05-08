
package com.ebm.model.pacsreport;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>returnresult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="returnresult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returncode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="errormsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnresult", namespace = "http://www.ebm.com/webservice", propOrder = {
    "returncode",
    "errormsg"
})
public class Returnresult {

    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected Integer returncode;
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected String errormsg;

    public  Returnresult(){

    }
    public  Returnresult(Integer returncode,String errormsg) {
        this.returncode = returncode;
        this.errormsg = errormsg;
    }


        /**
         * ��ȡreturncode���Ե�ֵ��
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
    public Integer getReturncode() {
        return returncode;
    }

    /**
     * ����returncode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturncode(Integer value) {
        this.returncode = value;
    }

    /**
     * ��ȡerrormsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * ����errormsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrormsg(String value) {
        this.errormsg = value;
    }

    public static  Returnresult error(String errormsg){
        return new Returnresult(-1,errormsg);
    }
    public static  Returnresult ok(String succMsg){
        return new Returnresult(1,"success");

    }
}
