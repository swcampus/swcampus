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
//context ��θ� �˾ƾ� �׽�Ʈ ����
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
		review.setContents("���� ����");
		review.setStarRating(4);
		
		service.register(review);
		
		log.info("������ �Խù��� ��ȣ : " + review.getReviewId());
	}
	
}
