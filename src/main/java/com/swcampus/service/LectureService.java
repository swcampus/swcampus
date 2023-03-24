package com.swcampus.service;

import java.util.List;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.LectureVO;

public interface LectureService {
	
	public void insertLecture(LectureVO lectureVO);
	
	public List<LectureVO> getLectureList(Criteria criteria);
	
}
