package com.service.impl;

import com.dao.IRuleDao;
import com.dao.impl.RuleDao;
import com.model.Rule;
import com.service.IRuleService;

public class RuleService implements IRuleService {
	
	@Override
	public Rule getRule(int id) {	
		IRuleDao dao = new RuleDao();	
		return dao.getRule(id);
	}
	
	@Override
	public boolean setRule(Rule rule, int id) {
		IRuleDao dao = new RuleDao();
		return dao.setRule(rule,id);
	}

}
