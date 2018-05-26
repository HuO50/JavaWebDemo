package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.INewsDao;
import com.model.News;
import com.util.DBUtil;

public class NewsDao implements INewsDao {

	@Override
	public List<News> getallNews() {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from news";
		List<News> list = new ArrayList<News>();
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				News news = new News();
				news.setId(resultSet.getInt("id"));
				news.setTitle(resultSet.getString("title"));
				news.setAuthor(resultSet.getString("author"));
				news.setTime(resultSet.getDate("time"));
				news.setContent(resultSet.getString("content"));
				news.setMark(resultSet.getString("mark"));
				list.add(news);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public News getNews(int id) {
		// TODO Auto-generated method stub
		News news = new News();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from news where id = " + id;
		System.out.println(sql);
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();

			while (resultSet.next()) {
				news.setId(resultSet.getInt("id"));
				news.setTitle(resultSet.getString("title"));	
				news.setAuthor(resultSet.getString("author"));
				news.setTime(resultSet.getDate("time"));
				news.setContent(resultSet.getString("content"));
				news.setMark(resultSet.getString("mark"));

			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return news;
	}

	@Override
	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "insert into news (title,author,time,content,mark)values(?,?,?,?,?)";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, news.getTitle());
			pStatement.setString(2, news.getAuthor());
			pStatement.setDate(3, news.getTime());
			pStatement.setString(4, news.getContent());
			pStatement.setString(5, news.getMark());
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
	public boolean modifyNews(int id, News news) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = DBUtil.getConnection();
		String sql = "update news set title=?, author=?, content=?, mark=? where id = ?";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, news.getTitle());
			pStatement.setString(2, news.getAuthor());
			pStatement.setString(3, news.getContent());
			pStatement.setString(4, news.getMark());
			pStatement.setInt(5, id);
			pStatement.executeUpdate();
			connection.close();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteNews(int id) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection connection = DBUtil.getConnection();
		String sql = "delete from news where id = '" + id + "'";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
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
	public List<News> getKindNews(String mark) {
		List<News> list = new ArrayList<News>();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from news where mark = '" + mark + "'";
		// String sql = "select * from news where mark = ?"+ mark ;
		// System.out.println(sql);
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				News news = new News();
				news.setId(resultSet.getInt("id"));
				news.setTitle(resultSet.getString("title"));
				news.setAuthor(resultSet.getString("author"));
				news.setTime(resultSet.getDate("time"));
				news.setContent(resultSet.getString("content"));
				news.setMark(resultSet.getString("mark"));
				list.add(news);
			}
			connection.close();
		} catch (Exception e) {

		}
		return list;
	}

	// below are for community news
	@Override
	public List<News> getCommuNews() {
		List<News> list = new ArrayList<News>();
		Connection connection = DBUtil.getConnection();
		String sql = "select * from news where mark = '学术交流' or mark = '合作研究'";
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				News news = new News();
				news.setId(resultSet.getInt("id"));
				news.setTitle(resultSet.getString("title"));
				news.setAuthor(resultSet.getString("author"));
				news.setTime(resultSet.getDate("time"));
				news.setContent(resultSet.getString("content"));
				news.setMark(resultSet.getString("mark"));
				list.add(news);
			}
			connection.close();
		} catch (Exception e) {

		}

		return list;
	}

	@Override
	public List<News> getResultNews() {
		List<News> list = new ArrayList<News>();
		String sql = "select * from news where mark = '重大项目' or mark = '科学研究' or mark = '精品课程'";
		Connection connection = DBUtil.getConnection();
		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				News news = new News();
				news.setId(resultSet.getInt("id"));
				news.setTitle(resultSet.getString("title"));
				news.setAuthor(resultSet.getString("author"));
				news.setTime(resultSet.getDate("time"));
				news.setContent(resultSet.getString("content"));
				news.setMark(resultSet.getString("mark"));
				list.add(news);
			}
			connection.close();
		} catch (Exception e) {

		}

		return list;
	}
}
