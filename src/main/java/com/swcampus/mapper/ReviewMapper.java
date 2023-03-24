package com.swcampus.mapper;

import java.util.List;

import com.swcampus.domain.ReviewDTO;
import com.swcampus.domain.ReviewVO;

public interface ReviewMapper {
	
	// 리뷰 등록   
	Integer insert(ReviewVO reviewVo);
	
	// 리뷰 전체 목록
	List<ReviewVO> getAllList();
	
	// 특정 강의의 리뷰 목록
	List<ReviewVO> getListByLectureId(Long lectureId);
	
	// 내가 작성한 강의 리뷰 목록
	List<ReviewVO> getMyList(String email);
	
	// 리뷰 상세
	ReviewVO read(Long reviewId);
	
	// 리뷰 수정
	Integer update(ReviewVO review);
	
	// 리뷰 삭제
	Integer delete(Long reviewId);
	
	// 베스트 강의 리뷰 8개 목록
	List<ReviewDTO> getBestList();
	
	// 최신 강의 리뷰 8개 목록
	List<ReviewVO> getNewsetList();
	
	// 리뷰 승인 상태 변경
	Integer updateApproval(ReviewVO review);
	
	// 모든 리뷰의 개수
	Long getReviewListCnt();
	
	// 특정 강의의 리뷰 개수
	Long getReviewListCntByLectureId(Long lectureId);
	
	// 특정 강의의 리뷰 평점
	Float getStarRatingByLectureId(Long lectureId);
	
}
