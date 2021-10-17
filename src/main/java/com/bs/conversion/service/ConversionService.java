package com.bs.conversion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ConversionService {

	@Autowired
	ConversionFactory factory;
	
	public Double getConversion(String type, String toUnit, Double value) {
		Conversion conversion =	factory.getConversion(type);
		if(toUnit.equalsIgnoreCase("IMPERIAL")) {
			return conversion.convertToImperial(value);
		} else if(toUnit.equalsIgnoreCase("METRIC")){
			return conversion.convertToMetric(value);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Conversion System <" + toUnit + ">");
		}
	}
}
