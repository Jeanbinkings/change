package com.Jeanbin.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.Jeanbin.dao.EntityDao;
import cn.Jeanbin.service.EntityService;

public class DBTester {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		//fail("Not yet implemented");
		EntityService es = new EntityService();
		List list  = es.showtabls();
		for (Object str : list) {
			System.out.println(str.toString());
		}
	}

}
