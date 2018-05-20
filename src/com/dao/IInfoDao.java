package com.dao;

import com.model.Info;

public interface IInfoDao {

	public boolean setInfo(Info info, int id);
	
	public Info getInfo(int id);
	
}
