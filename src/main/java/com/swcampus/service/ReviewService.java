package com.swcampus.service;

import java.util.List;

import com.swcampus.domain.ReviewVO;

public interface ReviewService {
	
	// 리뷰 등록
	public int register(ReviewVO review);
	
	// 리뷰 전체 목록
	public List<ReviewVO> getAllList();
	
	// 특정 강의의 리뷰 목록
	public List<ReviewVO> getListByLectureId(Long lectureId);
	
	// 특정 회원이 작성한 강의 리뷰 목록
	public List<ReviewVO> getMyList(String email);
	
	// 리뷰 상세
	public ReviewVO get(Long reviewId);
	
	// 리뷰 수정
	public boolean modify(ReviewVO review);
	
	// 리뷰 삭제
	public boolean remove(Long reviewId);
}
