
package com.playsafe.conversions.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.6
 * Thu Apr 30 17:35:09 IDT 2020
 * Generated source version: 3.3.6
 */

@XmlRootElement(name = "toCelsius", namespace = "http://conversions.playsafe.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toCelsius", namespace = "http://conversions.playsafe.com/")

public class ToCelsius {

    @XmlElement(name = "arg0")
    private double arg0;

    public double getArg0() {
        return this.arg0;
    }

    public void setArg0(double newArg0)  {
        this.arg0 = newArg0;
    }

}

