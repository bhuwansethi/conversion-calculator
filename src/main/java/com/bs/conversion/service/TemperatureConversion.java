package com.bs.conversion.service;

public class TemperatureConversion implements Conversion{

	//Metric - Celcius
	//Imperial - Fahrenheit 
	
	@Override
	public Double convertToMetric(Double value) {
		return ((value-32)*5)/9;
	}

	@Override
	public Double convertToImperial(Double value) {
		return ((value*9)/5)+32;
	}

}
