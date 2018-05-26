package com.dao;

import com.model.Picture;

public interface IPictureDao {

	public boolean setPicture(Picture picture, int id);
	
	public Picture getPicture(int id);
}
