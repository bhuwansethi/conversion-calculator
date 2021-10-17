package com.bs.conversion.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ConversionFactory {

	public Conversion getConversion(String type) {
		if(type.equalsIgnoreCase("TEMPERATURE")) {
			return new TemperatureConversion();
		} else if (type.equalsIgnoreCase("LENGTH")) {
			return new LengthConversion();
		} else if (type.equalsIgnoreCase("AREA")) {
			return new AreaConversion();
		} else if (type.equalsIgnoreCase("VOLUME")) {
			return new VolumeConversion();
		} else if (type.equalsIgnoreCase("WEIGHT")) {
			return new WeightConversion();
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Category of Conversion <" + type + ">");
		}
	}
}
