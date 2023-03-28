package com.demo;

public class Author {

	private int aid;
	private String aname;
	private String dob;

	public Author() {

	}

	public Author(int aid, String aname, String dob) {
		this.aid = aid;
		this.aname = aname;
		this.dob = dob;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		// return "Author [aid=" + aid + ", aname=" + aname + ", dob=" + dob + "]";
		return "Author Id:" + aid + " Author name:" + aname + "Author Birthdate:" + dob;
	}

}
