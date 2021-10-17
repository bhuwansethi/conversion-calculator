package com.bs.conversion.service;

public class VolumeConversion implements Conversion{

	//Imperial - Gallon
	//Metric - Litre
	
	@Override
	public Double convertToMetric(Double value) {
		return value*3.785;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value/3.785;
	}

}
