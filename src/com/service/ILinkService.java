package com.service;

import java.util.List;

import com.model.Link;

public interface ILinkService {

	public Link getLink(int id);
	
	public boolean setLink(Link link);
	
	public boolean delLink(int id);
	
	public List<Link> getAllLink();
}
