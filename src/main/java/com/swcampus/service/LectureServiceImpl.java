package com.swcampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swcampus.domain.LectureVO;
import com.swcampus.mapper.LectureMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LectureServiceImpl implements LectureService{
	
	@Autowired
	private LectureMapper lectureMapper;
	
	//스프링 시큐리티에서 세션값 가져와서 관리자인지 유저인지 확인 해야함
	@Override
	public void insertLecture(LectureVO lectureVO) {
		
	}
	
	
	
	
}
