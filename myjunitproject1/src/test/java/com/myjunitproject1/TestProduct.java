package com.myjunitproject1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProduct {

	
	   @Test
	   public void testReg() {
		   
		   String expected = "welcome";
		   String actual = "welcome1";
		   assertEquals(expected, actual,"the expected and actual outout is not same");
		   
	   }
}
