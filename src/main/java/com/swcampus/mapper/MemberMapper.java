package com.swcampus.mapper;

import org.apache.ibatis.annotations.Select;

import com.swcampus.domain.MemberVO;

public interface MemberMapper {
	
	public int registerMember(MemberVO memberVO);

}
