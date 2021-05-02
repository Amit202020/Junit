package com.myjunitproject1;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(OrderAnnotation.class)
public class TestDept {

	@Test
	@Order(7)
	public void testRegistration() {
		System.out.println("Employee registration");
	}

	@Test
	@Order(17)
	public void testSearch() {
		System.out.println("Employee search");
	}
	
	@Test
	@Order(3)
	public void testDisplay() {
		System.out.println("Employee Display");
	}

}
