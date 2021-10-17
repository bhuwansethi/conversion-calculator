package com.bs.conversion.service;

public class AreaConversion implements Conversion{

	//Metric - Hectare
	//Imperial - Acre
	
	@Override
	public Double convertToMetric(Double value) {
		return value/2.471;
	}

	//Acre
	@Override
	public Double convertToImperial(Double value) {
		return value*2.471;
	}

}
