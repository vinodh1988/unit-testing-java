package com.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runners.Suite.SuiteClasses;

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
	
	@Test
	@DisplayName("Value Setters and Getters")
	public void testSettersAndGetterS()
	{
		Student s=new Student();
		s.setSno(1);
		s.setName("Rahul");
		s.setCity("Chennai");
		
		

	}
	@Test
	@DisplayName("Check Unset Values")
	public void testUnsetValues() {
		Student s=new Student();
		assertEquals(s.getSno(),0);
		assertNull(s.getName());
		assertNull(s.getCity());
	}
	
	@Test
	@DisplayName("Overloaded Constructor must be there")
	public void constructorTest() {
		Student s=new Student(12,"Rahul","Chennai");
		assertNotNull(s);
		assertEquals(s.getSno(),12);
		assertEquals(s.getName(),"Rahul");
		assertEquals(s.getCity(),"Chennai");
	}
	
}
