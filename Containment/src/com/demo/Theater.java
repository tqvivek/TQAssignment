package com.demo;

public class Theater {
	private int tId;
	private String tNmae;
	private String location;
	private Movie movie;

	public Theater() {

	}

	public Theater(int tId, String tNmae, String location) {
		this.tId = tId;
		this.tNmae = tNmae;
		this.location = location;
	}

	public Theater(int tId, String tNmae, String location, Movie movie) {
		this.tId = tId;
		this.tNmae = tNmae;
		this.location = location;
		this.movie = movie;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettNmae() {
		return tNmae;
	}

	public void settNmae(String tNmae) {
		this.tNmae = tNmae;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theater [tId=" + tId + ", tNmae=" + tNmae + ", location=" + location + ", movie=" + movie + "]";
	}

}
