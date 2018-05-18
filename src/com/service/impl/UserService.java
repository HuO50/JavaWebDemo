package com.service.impl;

import java.util.List;

import com.dao.IUserDao;
import com.dao.impl.UserDao;
import com.model.User;
import com.service.IUserService;

public class UserService implements IUserService{

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();
		return dao.getAllUsers();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();		
		return dao.addUser(user);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();
		return dao.getUser(username);
	}

	@Override
	public boolean Userjurisdiction(String jurisdiction, int id) {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();
		return dao.Userjurisdiction(jurisdiction, id);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();
		return dao.getUser(id);
	}

	@Override
	public boolean modifyUser(User user, int id) {
		// TODO Auto-generated method stub
		IUserDao dao = new UserDao();
		return dao.modiftyUser(user, id);
	}

}
