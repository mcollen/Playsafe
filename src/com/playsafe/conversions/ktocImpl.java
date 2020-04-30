package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(targetNamespace = "http://conversions.playsafe.com/", endpointInterface = "com.playsafe.conversions.ktoc", portName = "ktocImplPort", serviceName = "ktocImplService")
public class ktocImpl implements ktoc{
	
	public double toCelsius(double Kelvins) {
		return (Kelvins - 273.15);
	}
}
