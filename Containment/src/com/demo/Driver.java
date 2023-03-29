package com.demo;

public class Driver {
	private String dname;
	private int licNum;
	private int exp;
	private Car car;

	public Driver() {

	}

	public Driver(String dname, int licNum) {
		this.dname = dname;
		this.licNum = licNum;
	}

	public Driver(String dname, int licNum, int exp, Car car) {
		this(dname, licNum);
		this.exp = exp;
		this.car = car;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getLicNum() {
		return licNum;
	}

	public void setLicNum(int licNum) {
		this.licNum = licNum;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Driver [dname=" + dname + ", licNum=" + licNum + ", exp=" + exp + ", car=" + car + "]";
	}

}
