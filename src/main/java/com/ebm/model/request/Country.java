
package com.ebm.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", namespace = "http://www.yourcompany.com/webservice", propOrder = {
    "name",
    "population",
    "capital",
    "currency"
})
public class Country {

    //required = true,默认为true，该参数必须要有值
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.ebm.com/webservice",required = true)
    protected int population;
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    protected String capital;
    @XmlElement(namespace = "http://www.ebm.com/webservice", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public int getPopulation() {
        return population;
    }


    public void setPopulation(int value) {
        this.population = value;
    }


    public String getCapital() {
        return capital;
    }


    public void setCapital(String value) {
        this.capital = value;
    }


    public Currency getCurrency() {
        return currency;
    }


    public void setCurrency(Currency value) {
        this.currency = value;
    }

}
