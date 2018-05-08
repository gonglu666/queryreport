
package com.ebm.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name"})
@XmlRootElement(name = "getCountryRequest", namespace = "http://www.ebm.com/webservice")
public class GetCountryRequest {
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }

}
