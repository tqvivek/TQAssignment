package com.demo;

public class Book {

	private String bname;
	private float bprice;
	private String btype;
	private Author author;

	public Book() {

	}

	public Book(String bname, float bprice, String btype, Author author) {
		super();
		this.bname = bname;
		this.bprice = bprice;
		this.btype = btype;
		this.author = author;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getBprice() {
		return bprice;
	}

	public void setBprice(float bprice) {
		this.bprice = bprice;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + ", bprice=" + bprice + ", btype=" + btype + ", author=" + author + "]";
	}

}
