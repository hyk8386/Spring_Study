package com.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;


public interface MemberDAO {
	public List selectAllMembers() throws DataAccessException ;		// 전체목록보기
	public int addMember(MemberVO memberVO) throws DataAccessException ;	//멤버추가

}
