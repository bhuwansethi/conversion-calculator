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

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConversionServiceTests {

	@Test
	void testGetConversionToMetric() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.convertToMetric(15.0)).isEqualTo(24.134999999999998);
	}
	
	@Test
	void testGetConversionToImperial() throws Exception {
		ConversionFactory factory = new ConversionFactory();
		Conversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.convertToImperial(10.0)).isEqualTo(6.215040397762586);
	}
		
}
