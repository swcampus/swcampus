/**
 * review 서비스 
 */
 
 var reviewService = (function(){
 
 	// 리뷰 등록
 	function add(review, callback, error){
 	
 		$.ajax({
 			type : 'post',
 			url : '/review/register',
 			data : JSON.stringfy(review),
 			contentType : 'application/json; charset=utf-8',
 			success : function(result, status, xhr){
 				if(callback){
 					callback(result);
 				}
 			},
 			error : function(xhr, status, er){
 				if(error){
 					error(er);
 				}
 			}
 		})
 	}
 	
 	// 전체 리뷰 목록
 	function getAllList(callback, error){
 		
 		$.ajax({
 			type : 'get',
 			url : '/review/list',
 			contentType : 'application/json; charset=utf-8',
 			success : function(result, status, xhr){
 				if(callback){
 					callback(result);
 				}
 			},
 			error : function(xhr, status, er){
 				if(error){
 					error(er);
 				}
 			}
 		
 		})
 	}
 
	 return {
	 	add : add,
	 	getAllList : getAllList 
	 }
 
 })();
