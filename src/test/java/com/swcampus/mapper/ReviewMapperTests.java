package com.swcampus.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swcampus.domain.ReviewVO;

import lombok.extern.log4j.Log4j;

//test
@RunWith(SpringJUnit4ClassRunner.class)
//context ��θ� �˾ƾ� �׽�Ʈ ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReviewMapperTests {
	
	@Autowired
	private ReviewMapper mapper;
	
//	@Test
//	public void testInsert() {
//		
//		ReviewVO review = new ReviewVO();
//		review.setEmail("aaa@aaa.com");
//		review.setLectureId(2L);
//		review.setContents("���� ����4");
//		review.setStarRating(4);
//		
//		int count = mapper.insert(review);
//		
//	
//		log.info("insert count : " + count);
//	}
	
//	@Test
//	public void testGetAllList() {
//		
//		List<ReviewVO> list = mapper.getAllList();
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetListByLectureId() {
//		List<ReviewVO> list = mapper.getListByLectureId(2L);
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetMyList() {
//		
//		List<ReviewVO> list = mapper.getMyList("aaa@aaa.com");
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testRead() {
//		log.info(mapper.read(1L));
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		ReviewVO review = new ReviewVO();
//		review.setReviewId(1L);
//		review.setLectureId(1000L);
//		review.setContents("리뷰 내용");
//		review.setStarRating(4);
//		
//		int count = mapper.update(review);
//		log.info("update count : " + count);
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		int count = mapper.delete(1L);
//		log.info("delete count : " + count);
//	}
	
	
	@Test
	public void testGetBestList() {
		mapper.getBestList().forEach(review -> log.info(review));
	}
}
