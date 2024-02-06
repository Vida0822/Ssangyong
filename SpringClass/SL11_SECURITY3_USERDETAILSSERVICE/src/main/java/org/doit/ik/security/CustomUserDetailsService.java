package org.doit.ik.security;

import org.doit.ik.domain.MemberVO;
import org.doit.ik.mapper.MemberMapper;
import org.doit.ik.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Component("customUserDetailsService")
@Log4j
public class CustomUserDetailsService implements UserDetailsService {
	
	// @Setter(onMethod=@__({@Autowired}))
	@Autowired
	private MemberMapper memberMapper ; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		log.warn("> Load User By UserName : " + username);
		
		// vo 객체에는 회원정보 + 권한정보(authList) 
		MemberVO vo = this.memberMapper.read(username) ; 
		log.warn("> Queired by Member mapper : " + vo);

		// UserDetails  <-- 변환 x -- 										vo 
//								User 구현한 org.doit.ik.security.domain.CustomUser을 만들어서 
		return vo ==null?null:new CustomUser(vo) ; 
		
	} // loadUserByUsername

} // CustomUserDetailsService
