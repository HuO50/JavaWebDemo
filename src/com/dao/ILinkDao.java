package com.dao;

import java.util.List;

import com.model.Link;

public interface ILinkDao {

	public Link getLink(int id);
	
	public boolean setLink(Link link);
	
	public List<Link> getAllLink();
	
	public boolean delLink(int id);
	
}
