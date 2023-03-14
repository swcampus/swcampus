package com.swcampus.persistence;

import java.sql.Connection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swcampus.mapper.ReviewMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//context 경로를 알아야 테스트 가능
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReviewMapperTests {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Test
	public void testExist() {
		log.info(reviewMapper.getTime());
		log.info("--------------------------------------");
	}
}


