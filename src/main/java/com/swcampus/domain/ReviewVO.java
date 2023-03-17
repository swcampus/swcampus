package com.swcampus.domain;

import lombok.Data;

@Data
public class ReviewVO {
   
   private Long reviewId;
   private String email;
   private Long lectureId;
   private String regDate;
   private int starRating;
   private String contents;
   private String approval;
}
