package com.inti.formation.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.formation.service.CalculatriceService;

public class CalculatriceServiceTest {
	
	
	
	@Test
	public void additionTest() {
		CalculatriceService calcService = new CalculatriceService();
		int a = 5;
		int b = 6;
		int result = calcService.adition(a, b);
		assertEquals(11, result);
		
	}

}
