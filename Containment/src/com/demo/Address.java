package com.demo;

public class Address {
	private String city;
	private String state;
	private String country;
	private Person person;

	public Address() {

	}

	public Address(String city, String state, String country, Person person) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.person = person;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", person=" + person + "]";
	}

}