package com.swcampus.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MemberTest {
	
	@Autowired
	private PasswordEncoder pwencoder;
	
	@Autowired
	private DataSource ds;
	
	@Test
	public void testInsertMember() {
		
		String sql = "insert into member(email, password, name, phone, company, job, regdate, auth) values (?,?,?,?,?,?,?,?)";
		
		for(int i=0;i<10;i++) {
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, i + "@" + i + ".com");
				pstmt.setString(2, pwencoder.encode("pw" + i));
				pstmt.setString(3, "일반사용자" + i);
				pstmt.setString(4, "010-1111-111" + i);
				pstmt.setString(5, "kosta");
				pstmt.setString(6, "개발자");
				pstmt.setString(7, "2023-03-31");
				pstmt.setString(8, "ROLE_MEMBER");
				
//				if(i < 8) {
//					pstmt.setString(1, i + "@" + i + ".com");
//					pstmt.setString(3, "일반사용자" + i);
//				}else {
//					pstmt.setString(1, i + "@" + i + ".com");
//					pstmt.setString(3, "관리자" + i);
//				}
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {}
				}
				if(con != null) {
					try {
						con.close();
					} catch (Exception e) {}
				}
			}
		}
		
	}

}
