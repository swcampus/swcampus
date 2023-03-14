package com.swcampus.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

//test
@RunWith(SpringJUnit4ClassRunner.class)
//context 경로를 알아야 테스트 가능
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testExist() {
		try {
			Connection con = dataSource.getConnection();
			System.out.println("connection success");
			log.info(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}