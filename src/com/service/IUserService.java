package com.service;

import java.util.List;

import com.model.User;

public interface IUserService {
	
	public List<User> getallUsers();
	
	public boolean addUser(User user);
	
	public User getUser(String username);
	
	public boolean Userjurisdiction(String jurisdiction, int id);

	public User getUser(int id);
	
	public boolean modifyUser(User user, int id);
}
