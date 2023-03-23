package com.swcampus.service;

import java.util.List;

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
	public int registerMember(MemberVO memberVO) {
		return memberMapper.registerMember(memberVO);
	}

	@Override
	public MemberVO getMember(String email) {
		return memberMapper.readMember(email);
	}

	@Override
	public int modifyMember(MemberVO memberVO) {
		return memberMapper.updateMember(memberVO);
	}

	@Override
	public int removeMember(String email) {
		return memberMapper.deleteMember(email);
	}

	@Override
	public List<MemberVO> getListMember() {
		return memberMapper.getListMember();
	}

}
