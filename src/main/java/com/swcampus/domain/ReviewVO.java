package com.swcampus.domain;

import lombok.Data;

// ��ȿ�� �˻縦 ���� ������ 1~5����

@Data
public class ReviewVO {
	
	private Long reviewId;
	private String email;
	private Long lectureId;
	private String regDate;
	private Integer starRating;
	private String contents;
	private String approval;
}
                                     