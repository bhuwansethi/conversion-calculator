package com.bs.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.conversion.service.ConversionService;

@RestController
@RequestMapping(value = "/api")
public class ConversionController {

	@Autowired
	ConversionService service;
	
	@GetMapping("/convert/{type}/{toUnit}/{value}")
	public ResponseEntity<String> conversion(@PathVariable final String type, @PathVariable final String toUnit, @PathVariable final Double value) {
		Double result = Math.round(service.getConversion(type, toUnit, value)*100.0)/100.0;
		return new ResponseEntity<>(result.toString(), HttpStatus.OK);
	}
	
	
}
