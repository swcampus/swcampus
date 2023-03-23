package com.swcampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swcampus.domain.ReviewDTO;
import com.swcampus.domain.ReviewVO;
import com.swcampus.mapper.ReviewMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class ReviewsServieceImpl implements ReviewService {
	
	@Autowired
	private ReviewMapper mapper;

	// 리뷰 등록
	@Override
	public int register(ReviewVO review) {
		
		log.info("review register......" + review);
		
		int result = mapper.insert(review);
		
		// 리뷰에 첨부된 이미지 파일이 있으면 이미지 파일을 database에 저장
		// image 구현시 추가 구현
		
		return result;
	}

	// 리뷰 전체 목록
	@Override
	public List<ReviewVO> getAllList() {
		
		log.info("review getAllList.....");
		
		return mapper.getAllList();
	}

	// 특정 강의의 리뷰 목록
	@Override
	public List<ReviewVO> getListByLectureId(Long lectureId) {
		
		log.info("review getListByLectureId.....");
		
		return mapper.getListByLectureId(lectureId);
	}

	// 내가 작성한 강의 리뷰 목록
	@Override
	public List<ReviewVO> getMyList(String email) {

		log.info("review getMyList.....");
		
		return mapper.getMyList(email);
	}

	// 리뷰 상세
	@Override
	public ReviewVO get(Long reviewId) {

		log.info("review get.....");
		
		return mapper.read(reviewId);
	}

	// 리뷰 수정
	@Override
	public boolean modify(ReviewVO review) {

		log.info("review modify.....");
		
		// 작성자 본인과 일치하는지 확인한 후에 수정이 가능해야한다.
		
		return mapper.update(review) == 1;
	}

	// 리뷰 삭제
	@Override
	public boolean remove(Long reviewId) {

		log.info("review remove.....");
		
		// 작성자 본인과 일치하는지 확인한 후에 수정이 가능해야한다.
		
		return mapper.delete(reviewId) == 1;
	}

	// 베스트 강의 리뷰 8개 목록
	@Override
	public List<ReviewDTO> getBestList() {
		
		log.info("review getBestList.....");
		
		return mapper.getBestList();
	}

	@Override
	public List<ReviewVO> getNewsetList() {
		
		log.info("review getNewsetList.....");
		
		return mapper.getNewsetList();
	}

	@Override
	public Long getReviewListCnt() {
		
		log.info("review getReviewListCnt.....");
		
		return mapper.getReviewListCnt();
	}

	@Override
	public Long getReviewListCntByLectureId(Long lectureId) {
		
		log.info("review getReviewListCntByLectureId.....");
		
		return mapper.getReviewListCntByLectureId(lectureId);
	}

	@Override
	public Float getStarRatingByLectureId(Long lectureId) {
		
		log.info("review getStarRatingByLectureId.....");
		
		return mapper.getStarRatingByLectureId(lectureId);
	}

	@Override
	public Integer updateApproval(ReviewVO review) {
		
		log.info("review updateApproval.....");
		
		// 관리자인지 확인한 후에 
		
		return mapper.updateApproval(review);
	}
	
	
}
