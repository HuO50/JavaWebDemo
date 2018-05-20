package com.dao.impl;

import java.sql.SQLException;

import com.dao.IInfoDao;
import com.model.Info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBUtil;

public class InfoDao implements IInfoDao {

	@Override
	public boolean setInfo(Info info, int id) {
		boolean result = false;
		Connection connection = DBUtil.getConnection();
		
		String sql = "update info set abstractinfo = ?, member = ?, innerresearch = ?, outerresearch = ?, langresearch = ?, standresearch = ?, multioffice = ?, policyresearch = ?, honorpresident = ?, president = ? where id = ?";
		try {
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, info.getAbstractinfo());
		pStatement.setString(2, info.getMember());
		pStatement.setString(3, info.getInnerresearch());
		pStatement.setString(4, info.getOuterresearch());
		pStatement.setString(5, info.getLangresearch());
		pStatement.setString(6, info.getStandresearch());
		pStatement.setString(7, info.getMultioffice());
		pStatement.setString(8, info.getPolicyresearch());
		pStatement.setString(9, info.getHonorpresident());
		pStatement.setString(10, info.getPresident());
		pStatement.setInt(11, id);
		
		pStatement.executeUpdate();
		connection.close();
		result=true;
		
		
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return result;
	}

	@Override
	public Info getInfo(int id) {
		String sql = "select * from info where id =" + id;
		Info info = new Info();
		Connection connection = DBUtil.getConnection();
		try {
		PreparedStatement pStatement = connection.prepareStatement(sql);
		
		ResultSet resultSet = pStatement.executeQuery();
		while(resultSet.next()) {
			info.setAbstractinfo(resultSet.getString("abstractinfo"));
			info.setMember(resultSet.getString("member"));
			info.setHonorpresident(resultSet.getString("honorpresident"));
			info.setInnerresearch(resultSet.getString("innerresearch"));
			info.setLangresearch(resultSet.getString("langresearch"));
			info.setMultioffice(resultSet.getString("multioffice"));
			info.setOuterresearch(resultSet.getString("outerresearch"));
			info.setPolicyresearch(resultSet.getString("policyresearch"));
			info.setPresident(resultSet.getString("president"));
			info.setStandresearch(resultSet.getString("standresearch"));
			info.setId(1);
		}
		connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return info;
	}
	
	
}
