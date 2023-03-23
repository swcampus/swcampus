package com.swcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.swcampus.domain.MemberVO;

public interface MemberMapper {
	
	public int registerMember(MemberVO memberVO);
	
	public MemberVO readMember(String email);
	
	public int deleteMember(String email);
	
	public int updateMember(MemberVO member);
	
	public List<MemberVO> getListMember();

}
