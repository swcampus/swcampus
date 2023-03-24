package com.swcampus.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewDTO {
	
	private Long lectureId;
	private String title;
	private String agency;
	private String target;
	private String method;
	private String category;
	private String teacher;
	private String startDate;
	private String endDate;
	private Float average;
	private Long count;
}
