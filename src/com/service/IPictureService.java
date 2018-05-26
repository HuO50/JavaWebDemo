package com.service;

import com.model.Picture;

public interface IPictureService {
	public Picture getPicture(int id);
	
	public boolean setPicture(Picture picture, int id);
}
