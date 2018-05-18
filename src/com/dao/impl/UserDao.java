package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IUserDao;
import com.model.User;
import com.util.DBUtil;

public class UserDao implements IUserDao{

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from user";
		List<User> list = new ArrayList<User>();
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setPhonenum(resultSet.getString("phonenum"));
				user.setLogintime(resultSet.getDate("logintime"));
				user.setJurisdiction(resultSet.getString("jurisdiction"));
				user.setEmail(resultSet.getString("email"));
				list.add(user);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = new User();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from user where id=" + id ;
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {		
				user.setId(id);
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setPhonenum(resultSet.getString("phonenum"));
				user.setLogintime(resultSet.getDate("logintime"));
				user.setJurisdiction(resultSet.getString("jurisdiction"));
				user.setEmail(resultSet.getString("email"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		User user = new User();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from user where username='" + username + "'";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {			
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setPhonenum(resultSet.getString("phonenum"));
				user.setLogintime(resultSet.getDate("logintime"));
				user.setJurisdiction(resultSet.getString("jurisdiction"));
				user.setEmail(resultSet.getString("email"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "insert into user (username,password,email,phonenum,jurisdiction,logintime)values(?,?,?,?,?,?)";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, user.getUsername());
			pStatement.setString(2, user.getPassword());
			pStatement.setString(3, user.getEmail());
			pStatement.setString(4, user.getPhonenum());
			pStatement.setString(5, user.getJurisdiction());
			pStatement.setDate(6, user.getLogintime());
			pStatement.executeUpdate();
			connection.close();
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean modiftyUser(User user,int id) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "update user set password=?, email=?, phonenum=? where id = ?";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, user.getPassword());
			pStatement.setString(2, user.getEmail());
			pStatement.setString(3, user.getPhonenum());
			pStatement.setInt(4, id);
			pStatement.executeUpdate();
			connection.close();
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean deleteUser(int id) {
		//  
		return false;
	}

	@Override
	public boolean Userjurisdiction(String jurisdiction, int id) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "update user set jurisdiction=? where id = ?";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, jurisdiction);
			pStatement.setInt(2, id);
			pStatement.executeUpdate();
			connection.close();
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	
}
