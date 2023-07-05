package org.doit.ik.domain;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private String birth;
	private String is_lunar;
	private String cphone;
	private String email;
	private String habit;
	private Date   regdate;
	
	// 트랜잭션 처리를 테스트하기 위해 point 컬럼 추가 -> field, getter, setter
	private int point;
	
	// 
	private boolean enabled ; 
	private List<AuthVO> authList ;  // ROLE_MANAGER, ROLE_ADMIN , ROLE_USER 
	// 해당  회원의 권한정보들을 list로 만들어 필드로 넣어줬기 때문에 멤버 객체만 사용해서 해당 멤버의 권한정보들을 다 읽어올 수 있음 
	
}
