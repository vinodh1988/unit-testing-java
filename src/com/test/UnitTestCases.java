package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class UnitTestCases {
	@Test
   public void sampleTest() {
	  assertEquals(3>5, false);
	  assertEquals("Roger".length(),5);
	  assertEquals(12%15,12);
   }
}
