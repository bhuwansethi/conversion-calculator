package com.bs.conversion.service;

public class LengthConversion implements Conversion{

	//Metric - KM
	//Imperial - Mile
	
	@Override
	public Double convertToMetric(Double value) {
		return 1.609*value;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value/1.609;
	}

}
