package com.service.impl;

import com.dao.IInfoDao;
import com.dao.impl.InfoDao;
import com.model.Info;
import com.service.IInfoService;

public class InfoService implements IInfoService {

	@Override
	public Info getInfo(int id) {
		IInfoDao iInfoDao = new InfoDao();
		return iInfoDao.getInfo(id);
	}

	@Override
	public boolean setInfo(Info info, int id) {
		IInfoDao iInfoDao = new InfoDao();
		return iInfoDao.setInfo(info, id);
	}

}
