package com.swcampus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private String email;
	private String password;
	private String name;
	private String phone;
	private String company;
	private String job;
	private String regDate;
	private String auth;

}
