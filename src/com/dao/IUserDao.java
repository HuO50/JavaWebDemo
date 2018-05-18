package com.dao;

import java.util.List;

import com.model.User;

public interface IUserDao {

	public List<User> getAllUsers();
	
	public User getUser(int id);
	
	public User getUser(String username);
	
	public boolean addUser(User user);
	
	public boolean modiftyUser(User user,int id);
	
	public boolean deleteUser(int id);
	
	public boolean Userjurisdiction(String jurisdiction, int id);
	
}
