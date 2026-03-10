package com;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAddition() {
		Calculator calc =new Calculator();
		int result =calc.add(2, 3);
		System.out.println(result);
		assertEquals(5,result);
	}

}
