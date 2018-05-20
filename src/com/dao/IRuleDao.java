package com.dao;

import com.model.Rule;

public interface IRuleDao {

	public boolean setRule(Rule rule, int id);
	
	public Rule getRule(int id);
}
