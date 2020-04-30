package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(name = "mtok", targetNamespace = "http://conversions.playsafe.com/")
public interface mtok {
	
	public double toKilometre(double miles);
}
