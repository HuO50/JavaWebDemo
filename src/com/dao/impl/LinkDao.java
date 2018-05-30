package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ILinkDao;
import com.model.Link;

import com.util.DBUtil;

public class LinkDao implements ILinkDao {

	@Override
	public Link getLink(int id) {
		
		
		String sql = "select * from link where id = " + id;
		Link link = new Link();
		Connection connection = DBUtil.getConnection();
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				link.setId(resultSet.getInt("id"));
				link.setLink(resultSet.getString("link"));
				link.setName(resultSet.getString("name"));
				
			}
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return link;
	}

	@Override
	public boolean setLink(Link link) {
		boolean result = false;
		
		String sql = "insert into link (link,name)values(?,?)";
		Connection connection = DBUtil.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, link.getLink());
			preparedStatement.setString(2, link.getName());
			preparedStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Link> getAllLink() {
		List<Link> links = new ArrayList<Link>();
		
		String sql = "select * from link";
		
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Link link = new Link();
				link.setId(resultSet.getInt("id"));
				link.setLink(resultSet.getString("link"));
				link.setName(resultSet.getString("name"));
				links.add(link);
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return links;
	}

	@Override
	public boolean delLink(int id){
		boolean result = false;
		String sql = "delete from link where id = " + id;
		
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
