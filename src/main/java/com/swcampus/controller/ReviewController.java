package com.swcampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.swcampus.domain.Criteria;
import com.swcampus.domain.PageDTO;
import com.swcampus.domain.ReviewDTO;
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
	public ResponseEntity<PageDTO> getAllList(Criteria cri){
		
		log.info("getAllList.....");
		
		Long total = service.getReviewListCnt(cri);
		List<ReviewVO> list = service.getAllList(cri);
		
		return new ResponseEntity<PageDTO> (new PageDTO(cri, total, list), HttpStatus.OK);
	}
	
	// 특정 강의의 리뷰 목록
	@GetMapping(value = "/list/lecture/{lectureId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PageDTO> getListByLectureId(@PathVariable("lectureId") Long lectureId, Criteria cri){
		
		log.info("getListByLecture..... / lectureId : " + lectureId);
		
		Long total = service.getReviewListCnt(cri);
		List<ReviewVO> list = service.getListByLectureId(lectureId, cri);
		
		return new ResponseEntity<PageDTO> (new PageDTO(cri, total, list), HttpStatus.OK);
	}
	
	// 내가 작성한 강의 리뷰 목록
	@GetMapping(value = "/mylist", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewVO>> getMyList(){
		
		// spring security 적용 전 테스트용
		String email = "aaa@aaa.com";
		
		// spring security 적용 후에 사용할 코드
//		UserDetails userDetails = (UserDetails) auth.getPrincipal();
//		List<ReviewVO> reviewList = service.getMyList(userDetails.getUsername());
//		String email = userDeails.getUsername();
		
		log.info("getMyList..... / memberId : " + email);
		
		return new ResponseEntity<List<ReviewVO>> (service.getMyList(email), HttpStatus.OK);	
	}
	
	// 승인 리뷰 목록
	@GetMapping(value = "/list/approve", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewVO>> getApprovedList(){
		
		log.info("getApprovedList.....");
		
		return new ResponseEntity<List<ReviewVO>> (service.getApprovedList(), HttpStatus.OK);
	}
	
	// 미승인 리뷰 목록
	@GetMapping(value = "/list/unapprove", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewVO>> getUnapprovedList(){
		
		log.info("getUnapprovedList.....");
		
		return new ResponseEntity<List<ReviewVO>> (service.getUnapprovedList(), HttpStatus.OK);
	}
	
	// 리뷰 상세
	@GetMapping(value = "/detail/{reviewId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReviewVO> get(@PathVariable("reviewId") Long reviewId, @ModelAttribute("cri") Criteria cri){
		
		log.info("get..... / reviewId : " + reviewId);
		
		return new ResponseEntity<ReviewVO> (service.get(reviewId), HttpStatus.OK);
	}
	
	// 리뷰 수정
	@RequestMapping(method = RequestMethod.PUT, value = "/update", consumes = "application/json", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<Criteria> modify(@RequestBody ReviewVO review, @ModelAttribute("cri") Criteria cri){
		
		log.info("modify..... / reviewVO : " + review);
		
		
		return service.modify(review) == true ? new ResponseEntity<Criteria> (cri, HttpStatus.OK) :
			new ResponseEntity<Criteria>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// 리뷰 삭제
	@GetMapping(value = "/delete/{reviewId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Criteria> remove(@PathVariable("reviewId") Long reviewId, @ModelAttribute("cri") Criteria cri){
		
		log.info("remove..... / reviewId : " + reviewId);
		
		return service.remove(reviewId) == true ? new ResponseEntity<Criteria> (cri, HttpStatus.OK) :
			new ResponseEntity<Criteria> (HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// 베스트 강의 리뷰 8개 목록
	@GetMapping(value = "/list/best", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewDTO>> getBestList() {
		
		log.info("getBestList.....");
		
		return new ResponseEntity<List<ReviewDTO>> (service.getBestList(), HttpStatus.OK);
	}
	
	// 최신 강의의 리뷰 8개 목록
	@GetMapping(value = "/list/newest", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReviewVO>> getNewestList(){
		
		log.info("getNewestList.....");
		
		return new ResponseEntity<List<ReviewVO>>(service.getNewsetList(), HttpStatus.OK);
	}
	
	// 리뷰 승인 상태 변경
	@GetMapping(value = "/approval", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> updateApproval(@RequestBody ReviewVO review){
		
		log.info("modify..... / reviewVO : " + review);
		
		return service.updateApproval(review) == true ? new ResponseEntity<String> ("Success", HttpStatus.OK) :
			new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	// 모든 강의의 리뷰 개수
	@GetMapping(value = "/count")
	public ResponseEntity<Long> getReviewListCnt(Criteria cri) {
		
		log.info("getReviewListCnt.....");
		
		return new ResponseEntity<Long>(service.getReviewListCnt(cri), HttpStatus.OK);
	}
	
	// 특정 강의의 리뷰 개수
	@GetMapping(value = "/count/{lectureId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Long> getReviewListCntByLectureId(@PathVariable("lectureId") Long lectureId) {

		log.info("getReviewListCntByLectureId.....");
		
		return new ResponseEntity<Long>(service.getReviewListCntByLectureId(lectureId), HttpStatus.OK);
	}
	
	// 특정 강의의 리뷰 평점
	@GetMapping(value = "/score/{lectureId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Long> getStarRatingByLectureId(@PathVariable("lectureId") Long lectureId) {

		log.info("getReviewListCntByLectureId.....");
		
		return new ResponseEntity<Long>(service.getReviewListCntByLectureId(lectureId), HttpStatus.OK);
	}
}
