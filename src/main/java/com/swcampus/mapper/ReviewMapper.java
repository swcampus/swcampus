package com.swcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.ReviewDTO;
import com.swcampus.domain.ReviewVO;

public interface ReviewMapper {
	
	// 리뷰 등록   
	Integer insert(ReviewVO reviewVo);
	
	// 리뷰 전체 목록
	// 검색 : 
	List<ReviewVO> getAllList(Criteria cri);
	
	// 특정 강의의 리뷰 목록
	List<ReviewVO> getListByLectureId(@Param("lectureId") Long lectureId, @Param("cri") Criteria cri);
	
	// 내가 작성한 강의 리뷰 목록
	List<ReviewVO> getMyList(String email);
	
	// 승인 리뷰 목록
	List<ReviewVO> getApprovedList();
	
	// 미승인 리뷰 목록
	List<ReviewVO> getUnapprovedList();
	
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
	Long getReviewListCnt(Criteria cri);
	
	// 특정 강의의 리뷰 개수
	Long getReviewListCntByLectureId(Long lectureId);
	
	// 특정 강의의 리뷰 평점
	Float getStarRatingByLectureId(Long lectureId);
	
}
