package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(name = "ktoc", targetNamespace = "http://conversions.playsafe.com/")
public interface ktoc {
	
	public double toCelsius(double kelvin);
}
