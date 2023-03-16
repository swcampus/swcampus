package com.swcampus.persistence;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swcampus.domain.MemberVO;
import com.swcampus.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//context ��θ� �˾ƾ� �׽�Ʈ ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testCreate() {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setEmail("a@a.com");
		memberVO.setName("홍길동");
		memberVO.setPassword("1234");
		memberVO.setPhone("010-111-1111");
//		memberVO.setRegDate("11:11");
		memberVO.setCompany("KOSTA");
		memberVO.setJob("개발자");
		memberVO.setAuth("관리자");
		
		memberMapper.registerMember(memberVO);
	}
}


