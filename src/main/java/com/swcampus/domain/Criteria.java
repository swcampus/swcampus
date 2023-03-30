package com.swcampus.domain;

import lombok.Data;

// 페이징 처리를 위한 객체
// 페이지 번호와 한 페이지당 몇 개의 데이터를 보여줄 것인지 결정

@Data
public class Criteria {
	
	private int pageNum;	// 페이지 번호
	private int amount;		// 한 페이지당 보여줄 데이터의 양
	
	public Criteria() {	
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
