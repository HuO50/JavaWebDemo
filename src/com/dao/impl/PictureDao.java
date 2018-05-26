/**
 * 
 */
package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.dao.IPictureDao;
import com.model.Picture;
import com.util.DBUtil;

/**
 * @author joshua
 *
 */
public class PictureDao implements IPictureDao {

	/* (non-Javadoc)
	 * @see com.dao.IPictureDao#setPicture(com.model.Picture)
	 * 设置图像路径，用于图像上传servlet
	 */
	@Override
	public boolean setPicture(Picture picture, int id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = DBUtil.getConnection();
		
		String sql = "update picture set name = ?, location = ? where id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, picture.getName());
			preparedStatement.setString(2, picture.getLocation());
			preparedStatement.setInt(3, picture.getId());
			preparedStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.dao.IPictureDao#getPicture(int)
	 */
	@Override
	public Picture getPicture(int id) {
		// TODO Auto-generated method stub
		Picture picture = new Picture();
		String sql = "select * from picture where id = " + id;
		Connection connection = DBUtil.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				picture.setId(id);
				picture.setName(resultSet.getString("name"));
				picture.setLocation(resultSet.getString("location"));
				
			}
			connection.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return picture;
	}

}
