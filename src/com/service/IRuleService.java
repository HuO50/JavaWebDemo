package com.service;

import com.model.Rule;

public interface IRuleService {
	
	public Rule getRule(int id);
	
	public boolean setRule(Rule rule, int id);

}
