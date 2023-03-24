package com.swcampus.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swcampus.domain.MemberVO;
import com.swcampus.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/member/")
@RestController
@Log4j
@AllArgsConstructor
public class MemberController {
	
	private MemberService memberService;
	
	@PostMapping(value = "/register", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> register(@RequestBody MemberVO memberVO){
		int insertCount = memberService.registerMember(memberVO);
		
		return insertCount == 1
				? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping(value = "/list", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<MemberVO>> getListMember(){
		return new ResponseEntity<List<MemberVO>>(memberService.getListMember(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/{email}/", consumes = "application/json", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<MemberVO> get(@PathVariable("email") String email){
		return new ResponseEntity<MemberVO>(memberService.getMember(email), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{email}/", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> removeMember(@PathVariable("email") String email){
		return memberService.removeMember(email) == 1
			? new ResponseEntity<String>("success", HttpStatus.OK)
			: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping(value = "/{email}/", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> modifyMember(@RequestBody MemberVO memberVO, @PathVariable("email") String email){
		memberVO.setEmail(email);
		
		return memberService.modifyMember(memberVO) == 1
			? new ResponseEntity<String>("success", HttpStatus.OK)
			: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
