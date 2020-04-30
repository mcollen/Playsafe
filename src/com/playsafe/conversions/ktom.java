package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(name = "ktom", targetNamespace = "http://conversions.playsafe.com/")
public interface ktom {
	
	public double toMiles(double kilometres);
}
