package com.model;

public class Course {

	private int cid;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	private String cname;
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + " ";
	}
}

