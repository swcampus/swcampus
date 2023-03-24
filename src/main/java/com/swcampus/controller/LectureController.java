package com.swcampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.LectureVO;
import com.swcampus.service.LectureService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/lecture")
public class LectureController {
	
	@Autowired
	private LectureService service;
	
	//전체 회원보기
	@GetMapping("/list/{pageNum}")
	public ResponseEntity<List<LectureVO>> getLectureList(@PathVariable("pageNum") int page) {
		Criteria criteria = new Criteria(page, 10);
		log.info("페이징" + criteria);
		return new ResponseEntity<List<LectureVO>> (service.getLectureList(criteria), HttpStatus.OK);
		
	}
	
}
