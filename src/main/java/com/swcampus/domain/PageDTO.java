package com.swcampus.domain;

import java.util.List;

import lombok.Data;

@Data
public class PageDTO {
	
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private Long total;
	private Criteria cri;
	
	private List<?> list;
	
	public PageDTO(Criteria cri, Long total, List<?> list) {
		
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * cri.getAmount();
		this.startPage = this.endPage - 9;
		
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		if(this.endPage > realEnd) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 10;
		this.next = this.endPage < realEnd;
		
		this.list = list;
	}
}
