package com.myjunitproject2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	Calculator   cobj;
	
	 @BeforeEach
	 public void info() {
		 cobj = new Calculator();
		 System.out.println("object creation");
	 }
	
	
	@Test
	public void testAdd() {
		  assertEquals(30 , cobj.add(10,20),"The actual value and expected value does not match");
	}
	
	@Test
	public void testSub() {
		  assertEquals(20 , cobj.sub(40,20),"The actual value and expected value does not match");
	}
	
	
	@AfterEach
	public void destroy() {
		cobj=null;
		System.out.println("object destroyed");
		
	}

}
