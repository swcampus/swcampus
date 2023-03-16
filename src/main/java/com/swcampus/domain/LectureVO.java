package com.swcampus.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LectureVO {
	
	private Long lectureID;
	private String agency;
	private String target;
	private String method;
	private String category;
	private String title;
	private String teacher;
	private Date StarDate;
	private Date endDate;
	private String classDetail;
	private String url;
}
