package com.swcampus.service;

import java.util.List;

import com.swcampus.domain.MemberVO;

public interface MemberService {
	
	public int registerMember(MemberVO memberVO);
	
	public MemberVO getMember(String email);
	
	public int modifyMember(MemberVO memberVO);
	
	public int removeMember(String email);
	
	public List<MemberVO> getListMember();

}
