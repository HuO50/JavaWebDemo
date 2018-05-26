package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IMemberDao;
import com.model.Member;
import com.util.DBUtil;

public class MemberDao implements IMemberDao{

	@Override
	public List<Member> getallMember(){
		Connection connection = DBUtil.getConnection();
		String sql = "select * from member";		
		List<Member> list = new ArrayList<Member>();
 		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				Member member = new Member();
				member.setId(resultSet.getInt("id"));
				member.setName(resultSet.getString("name"));
				member.setResume(resultSet.getString("resume"));
				member.setBelong(resultSet.getString("belong"));
				list.add(member);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	@Override
	public Member getMember(int id) {
		Member member = new Member();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from member where id = " + id;
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {	
				member.setId(resultSet.getInt("id"));
				member.setName(resultSet.getString("name"));
				member.setResume(resultSet.getString("resume"));
				member.setBelong(resultSet.getString("belong"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	@Override
	public boolean addMember(Member member) {
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "insert into member (name,resume,belong)values(?,?,?)";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, member.getName());
			pStatement.setString(2, member.getResume());
			pStatement.setString(3, member.getBelong());
			pStatement.executeUpdate();
			connection.close();
			b = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	@Override
	public boolean modifyMember(int id, Member member) {
		boolean result = false;
		Connection connection = DBUtil.getConnection();
		String sql = "update member set name=?, belong=?, resume=? where id = ?";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, member.getName());
			pStatement.setString(2, member.getBelong());
			pStatement.setString(3, member.getResume());
			pStatement.setInt(4, id);
			pStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public boolean deleteMember(int id){
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "delete from member where id = " + id;
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.executeUpdate();
			connection.close();
			b = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public List<Member> getKindMember(String belong){
		List<Member> list = new ArrayList<Member>();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from member where belong = '"+ belong + "'";

		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				Member member = new Member();
				member.setId(resultSet.getInt("id"));
				member.setName(resultSet.getString("name"));
				member.setResume(resultSet.getString("resume"));
				member.setBelong(resultSet.getString("belong"));
				list.add(member);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
