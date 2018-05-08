
package com.ebm.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country"
})
@XmlRootElement(name = "getCountryResponse", namespace = "http://www.ebm.com/webservice")
public class GetCountryResponse {

    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country value) {
        this.country = value;
    }

}
