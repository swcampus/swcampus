package com.swcampus.domain;

public enum ReviewApproval {
	
    PASS("승인"),     NONE("미승인");
	
	private String approval;

    ReviewApproval(String approval) {
        
    	this.approval = approval;
    }
    
    public String getApproval() {
    	
    	return this.approval;
    	
    }
}
