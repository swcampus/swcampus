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
//context 경로를 알아야 테스트 가능
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

	@Test
	public void testRegister() {
		
		ReviewVO review = new ReviewVO();
		review.setEmail("bbb@bbb.com");
		review.setLectureId(3L);
		review.setContents("리뷰 내용");
		review.setStarRating(4);
		
		service.register(review);
		
		log.info("생성된 게시물의 번호 : " + review.getReviewId());
	}
	
}
