package com.swcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.swcampus.domain.ReviewVO;

public interface ReviewMapper {
	
	// ���� ���
	int insert(ReviewVO reviewVo);
	
	// ���� ��ü ���
	List<ReviewVO> getAllList();
	
	// Ư�� ������ ���� ���
	List<ReviewVO> getListByLectureId(Long lectureId);
	
	// Ư�� ȸ���� �ۼ��� ���� ���� ���
	List<ReviewVO> getMyList(String email);
	
	// ���� ��
	ReviewVO read(Long reviewId);
	
	// ���� ����
	int update(ReviewVO review);
	
	// ���� ����
	int delete(Long reviewId);
}
