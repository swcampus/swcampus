package com.swcampus.domain;

import lombok.Data;

//유효성 검사를 통해 별점은 1~5까지

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