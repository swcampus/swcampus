package com.swcampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public ReviewVO get(Long reviewId) {

		log.info("review get.....");
		
		return mapper.read(reviewId);
	}

	@Override
	public boolean modify(ReviewVO review) {

		log.info("review modify.....");
		
		// 작성자 본인과 일치하는지 확인한 후에 수정이 가능해야한다.
		
		return mapper.update(review) == 1;
	}

	@Override
	public boolean remove(Long reviewId) {

		log.info("review remove.....");
		
		// 작성자 본인과 일치하는지 확인한 후에 수정이 가능해야한다.
		
		return mapper.delete(reviewId) == 1;
	}
}
