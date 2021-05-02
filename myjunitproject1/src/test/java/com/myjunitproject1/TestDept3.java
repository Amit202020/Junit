package com.myjunitproject1;

import org.junit.jupiter.api.MethodOrderer.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(Random.class)
public class TestDept3 {

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
