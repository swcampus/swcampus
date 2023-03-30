package com.swcampus.service;

import java.util.List;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.ReviewDTO;
import com.swcampus.domain.ReviewVO;

public interface ReviewService {
	
	// 리뷰 등록
	public int register(ReviewVO review);
	
	// 리뷰 전체 목록
	public List<ReviewVO> getAllList(Criteria cri);
	
	// 특정 강의의 리뷰 목록
	public List<ReviewVO> getListByLectureId(Long lectureId, Criteria cri);
	
	// 내가 작성한 강의 리뷰 목록
	public List<ReviewVO> getMyList(String email);
	
	// 승인 리뷰 목록
	public List<ReviewVO> getApprovedList();
	
	// 미승인 리뷰 목록
	public List<ReviewVO> getUnapprovedList();
	
	// 리뷰 상세
	public ReviewVO get(Long reviewId);
	
	// 리뷰 수정
	public boolean modify(ReviewVO review);
	
	// 리뷰 삭제
	public boolean remove(Long reviewId);
	
	// 베스트 강의 리뷰 8개 목록
	public List<ReviewDTO> getBestList();
	
	// 최신 강의 리뷰 8개 목록
	public List<ReviewVO> getNewsetList();
	
	// 리뷰 승인 상태 변경
	public boolean updateApproval(ReviewVO review);
	
	// 모든 리뷰 개수
	public Long getReviewListCnt(Criteria cri);
	
	// 특정 강의의 리뷰 개수
	public Long getReviewListCntByLectureId(Long lectureId);
	
	// 특정 강의의 리뷰 평점
	public Float getStarRatingByLectureId(Long lectureId);
	
}
