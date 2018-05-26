package com.dao;

import java.util.List;

import com.model.Member;

public interface IMemberDao {
	
	public List<Member> getallMember();
	
	public Member getMember(int id);
	
	public boolean addMember(Member member);
	
	public boolean modifyMember(int id, Member member);
	
	public boolean deleteMember(int id);
	
	public List<Member> getKindMember(String belong);
}
