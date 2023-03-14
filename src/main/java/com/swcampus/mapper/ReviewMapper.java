package com.swcampus.mapper;

import org.apache.ibatis.annotations.Select;

public interface ReviewMapper {
	
	@Select("SELECT sysdate from dual")
	public String getTime();

}
