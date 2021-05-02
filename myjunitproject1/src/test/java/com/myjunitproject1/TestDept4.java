package com.myjunitproject1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class TestDept4 {
	
	/*@BeforeEach
	public void info() {
		System.out.println("basic initialization");
	}*/
	
	
	@BeforeAll
	public static void myinfo() {
		System.out.println("Method Execute Once - before ");
	}
	
	
	@Test
	@DisplayName("This is Registration For Employee")
	public void testRegistration() {
		System.out.println("Employee registration");
	}

	@Test
	@DisplayName("This is Search For Emp")
	public  void testSearch() {
		System.out.println("Employee search");
	}
	
	@Test
	@Disabled
	public void testDisplay() {
		System.out.println("Employee Display");
	}
	
	@AfterAll
	public static void mydestroy() {
		System.out.println("Method Execute Once - after");
	}
	
	
	/*@AfterEach
	public  void  destroy() {
		System.out.println("Object Destroy");
	}*/
	

}
