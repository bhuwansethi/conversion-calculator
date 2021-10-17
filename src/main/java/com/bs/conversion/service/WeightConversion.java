package com.bs.conversion.service;

public class WeightConversion implements Conversion{

	//Metric - KG
	//Imperial - Pound
	
	@Override
	public Double convertToMetric(Double value) {
		return value/2.205;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value*2.205;
	}

}
