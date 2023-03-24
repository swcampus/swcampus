package com.swcampus.mapper;

import java.util.List;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.LectureVO;

public interface LectureMapper {
	
	public void insertLecture(LectureVO lectureVO);
	
	public List<LectureVO> getListLecturePaging(Criteria criteria);
}
