package com.swcampus.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swcampus.domain.ReviewVO;
import com.swcampus.mapper.ReviewMapperTests;

import lombok.extern.log4j.Log4j;

//test
@RunWith(SpringJUnit4ClassRunner.class)
//context 경로
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReviewServiceTests {
	
	@Autowired
	private ReviewService service;
	
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}

//	@Test
//	public void testRegister() {
//		
//		ReviewVO review = new ReviewVO();
//		review.setEmail("bbb@bbb.com");
//		review.setLectureId(3L);
//		review.setContents("리뷰 내용");
//		review.setStarRating(4);
//		
//		service.register(review);
//		
//		log.info("등록된 리뷰 번호 : " + review.getReviewId());
//	}
	
//	@Test
//	public void testGetAllList() {
//		service.getAllList().forEach( review -> log.info(review));
//	}
	
//	@Test
//	public void testGetListByLectureId() {
//		service.getListByLectureId(1L).forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetMyList() {
//		service.getMyList("aaa@aaa.com").forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(2L));
//		
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		ReviewVO review = service.get(1L);
//		
//		if(review == null) {
//			return;
//		}
//		
//		log.info("MODIFY RESULT : " + service.modify(review));
//	}
	
//	@Test
//	public void testDelete() {
//		
//		log.info("REMOVE RESULT : " + service.remove(1L));
//	}
}
