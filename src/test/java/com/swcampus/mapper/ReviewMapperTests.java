package com.swcampus.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.ReviewVO;

import lombok.extern.log4j.Log4j;

//test
@RunWith(SpringJUnit4ClassRunner.class)
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
//		review.setContents("리뷰내용");
//		review.setStarRating(4);
//		
//		int count = mapper.insert(review);
//		
//	
//		log.info("insert count : " + count);
//	}
	
	@Test
	public void testGetAllList() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(2);
		List<ReviewVO> list = mapper.getAllList(cri);
		list.forEach(review -> log.info(review));
	}
	
	
//	@Test
//	public void testPaging() {
//		
//		Criteria cri = new Criteria();
//		cri.setPageNum(2);
//		cri.setAmount(2);
//		List<ReviewVO> list = mapper.getAllList(cri);
//		list.forEach(review -> log.info(review));
//	}
	
	
//	@Test
//	public void testGetListByLectureId() {
//		Criteria cri = new Criteria();
//		cri.setPageNum(2);
//		cri.setAmount(2);
//		List<ReviewVO> list = mapper.getListByLectureId(2L, cri);
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetMyList() {
//		
//		List<ReviewVO> list = mapper.getMyList("aaa@aaa.com");
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetApprovedList() {
//		
//		List<ReviewVO> list = mapper.getApprovedList();
//		list.forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetUnapprovedList() {
//		
//		List<ReviewVO> list = mapper.getUnapprovedList();
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

//	@Test
//	public void testDelete() {
//		
//		int count = mapper.delete(1L);
//		log.info("delete count : " + count);
//	}
	
//	@Test
//	public void testGetBestList() {
//		mapper.getBestList().forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void testGetNewestList() {
//		mapper.getNewsetList().forEach(review -> log.info(review));
//	}
	
//	@Test
//	public void TestUpateApproval() {
//		
//		ReviewVO review = new ReviewVO();
//		review.setLectureId(1L);
//		review.setApproval("승인");
//		
//		log.info(mapper.updateApproval(review));
//	}
	
//	@Test
//	public void testGetReviewListCnt() {
//		log.info("총 리뷰 개수 : " +  mapper.getReviewListCnt());
//	}
	
//	@Test
//	public void TestGetReviewListCntByLectureId() {
//		log.info("리뷰 개수 : " +  mapper.getReviewListCntByLectureId(1L));
//	}
	
//	@Test
//	public void TestGetStarRatingByLectureId()	{
//		log.info("강의 평점 : " + mapper.getStarRatingByLectureId(1L));
//	}
	
}
