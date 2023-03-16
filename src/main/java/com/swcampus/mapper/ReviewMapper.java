package com.swcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.swcampus.domain.ReviewVO;

public interface ReviewMapper {
	
	@Select("SELECT sysdate from dual")
	public String getTime();
	
	int insert(ReviewVO reviewVo);
	List<ReviewVO> getAllList();
	List<ReviewVO> getListByLectureId(Long lectureId);
	List<ReviewVO> getMyList(String email);
	ReviewVO read(Long reviewId);
	int update(ReviewVO review);
	int delete(Long reviewId);
}
