/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bs.conversion.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@SpringBootTest
class ConversionFactoryTests {

	@Test
	void testGetConversionForLength() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.getClass().getName()).isEqualTo(LengthConversion.class.getName());
	}
	
	@Test
	void testGetConversionForArea() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("area");
		assertThat(fromFactory.getClass().getName()).isEqualTo(AreaConversion.class.getName());
	}

	@Test
	void testGetConversionForWeight() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("weight");
		assertThat(fromFactory.getClass().getName()).isEqualTo(WeightConversion.class.getName());
	}
	
	@Test
	void testGetConversionForVolume() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("volume");
		assertThat(fromFactory.getClass().getName()).isEqualTo(VolumeConversion.class.getName());
	}
	
	@Test
	void testGetConversionForTemperature() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("temperature");
		assertThat(fromFactory.getClass().getName()).isEqualTo(TemperatureConversion.class.getName());
	}
	
	@Test
	void testGetConversionForInvalidCategory() throws Exception {
		ResponseStatusException exception = new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Category of Conversion <abc>");
		ConversionFactory factory = new ConversionFactory();
		try {
			factory.getConversion("abc");
		} catch (Exception e) {
			assertEquals(e.getMessage(), exception.getMessage());
			assertEquals(((ResponseStatusException) e).getStatus(), exception.getStatus());
		}
	}
}
