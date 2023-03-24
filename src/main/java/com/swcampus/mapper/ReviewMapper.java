package com.swcampus.mapper;

import java.util.List;

import com.swcampus.domain.ReviewVO;

public interface ReviewMapper {
	
	// 리뷰 등록   
	int insert(ReviewVO reviewVo);
	
	// 리뷰 전체 목록
	List<ReviewVO> getAllList();
	
	// 특정 강의의 리뷰 목록
	List<ReviewVO> getListByLectureId(Long lectureId);
	
	// 특정 회원이 작성한 강의 리뷰 목록
	List<ReviewVO> getMyList(String email);
	
	// 리뷰 상세
	ReviewVO read(Long reviewId);
	
	// 리뷰 수정
	int update(ReviewVO review);
	
	// 리뷰 삭제
	int delete(Long reviewId);
}
