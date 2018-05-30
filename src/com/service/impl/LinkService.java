package com.service.impl;

import java.util.List;

import com.dao.ILinkDao;
import com.dao.impl.LinkDao;
import com.model.Link;
import com.service.ILinkService;

public class LinkService implements ILinkService {

	@Override
	public Link getLink(int id) {
		ILinkDao dao = new LinkDao();
		Link link = dao.getLink(id);
		return link;
	}

	@Override
	public boolean setLink(Link link) {
		boolean result = false;
		ILinkDao dao = new LinkDao();
		result = dao.setLink(link);
		return result;
	}

	@Override
	public boolean delLink(int id) {
		boolean result = false;
		ILinkDao dao = new LinkDao();
		result = dao.delLink(id);
		return result;
	}

	@Override
	public List<Link> getAllLink() {
		ILinkDao dao = new LinkDao();
		List<Link> links = dao.getAllLink();
		return links;
	}

}
