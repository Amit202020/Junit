package com.myjunitproject3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDBUtil {

	DBUtil obj;
	Connection con1;
	Connection con2;

	@BeforeEach
	public void info() {
		obj = new DBUtil();
	}

//	@Test
//	public void testGetCon() {
//		con1 = obj.getCon();
//		con2 = obj.getCon();
//		assertSame(con1, con2);
//	}
	
	@Test
    public void testGetCon(){
             assertDoesNotThrow( () -> {
                    con1 = obj.getCon();
              }) ;
    }
	
	

	@AfterEach
	public void destroy() {
		con1 = null;
		con2 = null;
		obj = null;
	}

//	@Test
//	public void testMyArray() {
//		int a[] = { 10, 20, 30 };
//		int b[] = { 15, 20, 30 };
//		assertArrayEquals(a, b,"arrays are not equals");
//	}
//	
	
//	@Test
//    public void testMyDetails(){
//               boolean exist = 56 > 30;
//               assertTrue(exist);
//    }
//	

}
