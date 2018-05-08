
package com.ebm.model.pacsreport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>data complex type?? Java ??
 * 
 * <p>??????????????????????е?????????
 * 
 * <pre>
 * &lt;complexType name="data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="currency" type="{http://www.ebm.com/webservice}data_row"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", namespace = "http://www.ebm.com/webservice", propOrder = {
    "data_row"
})
public class Data {

    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected List<DataRow> data_row;

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRow }
     * 
     * 
     */
    public List<DataRow> getData_row() {
        if (data_row == null) {
            data_row = new ArrayList<DataRow>();
        }
        return this.data_row;
    }

    public void setData_row(List<DataRow> data_row){
        this.data_row = data_row;
    }

}
