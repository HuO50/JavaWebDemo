package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.IRuleDao;
import com.model.Rule;
import com.util.DBUtil;

public class RuleDao implements IRuleDao {
	
	@Override
	public Rule getRule(int id) {
		Connection connection = DBUtil.getConnection();
		String sql = "select * from rule where id = " + id;
		Rule rule = new Rule();
				
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {		
				rule.setRecruit(resultSet.getString("recruit"));
				rule.setContract(resultSet.getString("contract"));
				rule.setId(1);
				
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rule;
	}

	@Override
	public boolean setRule(Rule rule, int id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = DBUtil.getConnection();
		String sql = "update rule set recruit=?, contract=? where id = ?";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, rule.getRecruit());
			pStatement.setString(2, rule.getContract());
			pStatement.setInt(3, id);
//			System.out.println(rule.toString());

			pStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
