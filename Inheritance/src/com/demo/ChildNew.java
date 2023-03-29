package com.demo;

import com.single.Parent;

public class ChildNew extends Parent {

	private int std;

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public static void main(String[] args) {
		ChildNew c = new ChildNew();
		c.setName("Omkar");
		c.setMarks(70);
		c.setStd(10);

		System.out.println(c.getName() + "  " + c.getMarks() + "  " + c.getStd());
	}

}
