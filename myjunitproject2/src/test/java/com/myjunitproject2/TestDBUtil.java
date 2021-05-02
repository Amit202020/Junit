package com.myjunitproject2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDBUtil {
	
	DBUtil  obj;
	Connection con;
	
	
	@BeforeEach
	public void info() {
		obj = new DBUtil();
	}
	
	
	@Test
	public void  testGetCon() {
		con= obj.getCon();
		assertNotNull(con);
	}
	
	@AfterEach
	public void destroy() {
         con=null;
         obj=null;
	}

}
