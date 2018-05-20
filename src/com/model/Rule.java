package com.model;

public class Rule {
	
	public Rule(String recruit, String contract, int id) {
		super();
		this.recruit = recruit;
		this.contract = contract;
		this.id = id;
	}
	
	public Rule() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String toString() {
		return "Rule [recruit=" + recruit + ", contract=" + contract + ", id=" + id + "]";
	}

	public String getRecruit() {
		return recruit;
	}

	public void setRecruit(String recruit) {
		this.recruit = recruit;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	private String recruit;

	private String contract;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
