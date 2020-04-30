package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(name = "ctok", targetNamespace = "http://conversions.playsafe.com/")
public interface ctok {
	
	public double toKelvin(double celsius);
}
