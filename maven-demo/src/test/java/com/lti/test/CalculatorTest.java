package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.demo.Calculator;

public class CalculatorTest
{

	@Test
	public void additionOf2Nos()
	{
		Calculator c = new Calculator();
		int result = c.add(20, 10);
		assertEquals(30,result);
	}
		
	@Test
	public void subtractionOf2Nos()
	{
		Calculator c1 = new Calculator();
		int result = c1.subtract(20, 10);
		assertEquals(10,result);
	}
}
