package com.myjunitproject1;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(Alphanumeric.class)
public class TestDept1 {

	@Test
	public void testRegistration() {
		System.out.println("Employee registration");
	}

	@Test
	public void testSearch() {
		System.out.println("Employee search");
	}
	
	@Test
	public void testDisplay() {
		System.out.println("Employee Display");
	}

}
