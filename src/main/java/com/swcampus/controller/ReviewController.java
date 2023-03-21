package com.swcampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swcampus.domain.ReviewVO;
import com.swcampus.service.ReviewService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
	// 리뷰 등록
	@PostMapping(value = "/register", consumes="application/json", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> create(@RequestBody ReviewVO review) {
		
		log.info("ReviewVO" + review);
		
		int insertCount = service.register(review);
		
		log.info("Review insert count : " + insertCount);
		
		return insertCount == 1? new ResponseEntity<String>("Success", HttpStatus.OK):
			new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// 리뷰 전체 목록
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewVO>> getAllList(){
		
		log.info("getAllList.....");
		
		return new ResponseEntity<List<ReviewVO>> (service.getAllList(), HttpStatus.OK);
	}
	
}
