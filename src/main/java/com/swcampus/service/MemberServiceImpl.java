package com.swcampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swcampus.domain.MemberVO;
import com.swcampus.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int register(MemberVO memberVO) {
		return memberMapper.registerMember(memberVO);
	}

}
