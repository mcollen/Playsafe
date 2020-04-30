package com.playsafe.conversions;

import javax.jws.WebService;

@WebService(targetNamespace = "http://conversions.playsafe.com/", endpointInterface = "com.playsafe.conversions.mtok", portName = "mtokImplPort", serviceName = "mtokImplService")
public class mtokImpl implements mtok{
	
	public double toKilometre(double miles) {
		return (miles * 1.60934);
	}
}
