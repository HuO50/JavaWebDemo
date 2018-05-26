package com.service;

import java.util.List;

import com.model.Member;


public interface IMemberService {
	public List<Member> getallMember();
	
	public boolean addMember(Member member);
	
	public Member getMember(int id);
	
	public boolean deleteMember(int id);
	
	public boolean modifyMember(int id, Member member);
	
	public List<Member> getKindMember(String belong);
}
