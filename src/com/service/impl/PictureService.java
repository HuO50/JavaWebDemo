package com.service.impl;

import com.dao.IPictureDao;
import com.dao.impl.PictureDao;
import com.model.Picture;
import com.service.IPictureService;

public class PictureService implements IPictureService {

	@Override
	public boolean setPicture(Picture picture, int id) {
		boolean result = false;
		IPictureDao iPictureDao = new PictureDao();
		result = iPictureDao.setPicture(picture, id);
		return result;
	}

	@Override
	public Picture getPicture(int id) {
		Picture picture;
		IPictureDao iPictureDao = new PictureDao();
		picture = iPictureDao.getPicture(id);
		return picture;
	}

}
