package com.swcampus.service;

import java.util.List;

import com.swcampus.domain.ReviewVO;

public interface ReviewService {
	
	// ���� ���
	public void register(ReviewVO review);
	
	// ���� ��ü ���
	public void getAllList();
	
	// Ư�� ������ ���� ���
	public List<ReviewVO> getListByLectureId(Long lectureId);
	
	// Ư�� ȸ���� �ۼ��� ���� ���� ���
	public List<ReviewVO> getMyList(String email);
	
	// ���� ��
	public ReviewVO get(Long reviewId);
	
	// ���� ����
	public boolean modify(ReviewVO review);
	
	// ���� ����
	public boolean remove(Long reviewId);
	
}
