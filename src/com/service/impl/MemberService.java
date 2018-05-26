package com.service.impl;

import java.util.List;

import com.dao.IMemberDao;
import com.dao.INewsDao;
import com.dao.impl.MemberDao;
import com.dao.impl.NewsDao;
import com.model.Member;
import com.model.News;
import com.service.IMemberService;

public class MemberService implements IMemberService {

	@Override
	public List<Member> getallMember() {
		IMemberDao dao = new MemberDao();
		return dao.getallMember();
	}

	@Override
	public boolean addMember(Member member) {
		IMemberDao dao = new MemberDao();
		return dao.addMember(member);
	}

	@Override
	public Member getMember(int id) {
		IMemberDao dao = new MemberDao();
		return dao.getMember(id);
	}

	@Override
	public boolean deleteMember(int id) {
		IMemberDao dao = new MemberDao();
		return dao.deleteMember(id);
	}

	@Override
	public boolean modifyMember(int id, Member member) {
		IMemberDao dao = new MemberDao();
		return dao.modifyMember(id, member);
	}

	@Override
	public List<Member> getKindMember(String belong){
		IMemberDao dao = new MemberDao();
		return dao.getKindMember(belong);
	}
}
