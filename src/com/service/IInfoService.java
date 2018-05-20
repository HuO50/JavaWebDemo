package com.service;

import com.model.Info;

public interface IInfoService {

	public Info getInfo(int id);
	
	public boolean setInfo(Info info, int id);
}
