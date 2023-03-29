package com.demo;

public class Movie {
	private int mId;
	private String mName;
	private String date;

	public Movie() {

	}

	public Movie(int mId, String mName) {
		this.mId = mId;
		this.mName = mName;

	}

	public Movie(int mId, String mName, String date) {
		this.mId = mId;
		this.mName = mName;
		this.date = date;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [MovieId=" + mId + ", MovieNameName=" + mName + ", Date=" + date + "]";
	}

}
