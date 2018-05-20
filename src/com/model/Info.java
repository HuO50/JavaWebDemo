package com.model;

public class Info {
	
	@Override
	public String toString() {
		return "Info [id=" + id + ", abstractinfo=" + abstractinfo + ", member=" + member + ", innerresearch="
				+ innerresearch + ", outerresearch=" + outerresearch + ", langresearch=" + langresearch
				+ ", standresearch=" + standresearch + ", multioffice=" + multioffice + ", policyresearch="
				+ policyresearch + ", honorpresident=" + honorpresident + ", president=" + president + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbstractinfo() {
		return abstractinfo;
	}
	public void setAbstractinfo(String abstractinfo) {
		this.abstractinfo = abstractinfo;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getInnerresearch() {
		return innerresearch;
	}
	public void setInnerresearch(String innerresearch) {
		this.innerresearch = innerresearch;
	}
	public String getOuterresearch() {
		return outerresearch;
	}
	public void setOuterresearch(String outerresearch) {
		this.outerresearch = outerresearch;
	}
	public String getLangresearch() {
		return langresearch;
	}
	public void setLangresearch(String langresearch) {
		this.langresearch = langresearch;
	}
	public String getStandresearch() {
		return standresearch;
	}
	public void setStandresearch(String standresearch) {
		this.standresearch = standresearch;
	}
	public String getMultioffice() {
		return multioffice;
	}
	public void setMultioffice(String multioffice) {
		this.multioffice = multioffice;
	}
	public String getPolicyresearch() {
		return policyresearch;
	}
	public void setPolicyresearch(String policyresearch) {
		this.policyresearch = policyresearch;
	}
	public String getHonorpresident() {
		return honorpresident;
	}
	public void setHonorpresident(String honorpresident) {
		this.honorpresident = honorpresident;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	private int id;
	private String abstractinfo;
	private String member;
	private String innerresearch;
	private String outerresearch;
	private String langresearch;
	private String standresearch;
	private String multioffice;
	private String policyresearch;
	private String honorpresident;
	private String president;
	
	

}
