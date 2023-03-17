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

	@Override
	public void register(ReviewVO review) {
		
		log.info("review register......" + review);
		
		int result = mapper.insert(review);
		
		// 리뷰에 첨부된 이미지 파일이 있으면 이미지 파일을 database에 저장
		// image 구현시 추가 구현 
	}

	@Override
	public void getAllList() {
		log.info("review getAllList.....");
		
		
	}

	@Override
	public List<ReviewVO> getListByLectureId(Long lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReviewVO> getMyList(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReviewVO get(Long reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(ReviewVO review) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Long reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

}
