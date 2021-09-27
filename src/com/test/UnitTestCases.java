package com.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.code.Student;


public class UnitTestCases {
	@Test
	@DisplayName("Sample Test Case")
   public void sampleTest() {
	  assertEquals(3>5, false);
	  assertEquals("Roger".length(),5);
	  assertEquals(12%15,12);
   }
	@Test
	@DisplayName("Should Create objects")
	public void createInstance() {
		assertNotNull(new Student());
	}
}
