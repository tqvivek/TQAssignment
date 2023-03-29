package com.demo;

public class MovieHall {

	public static void main(String[] args) {

		Movie m1 = new Movie(1, "Shole", "12/12/1988");
		Movie m2 = new Movie(2, "Wanted", "1/08/2012");
		Movie m3 = new Movie(3, "Sairat", "19/04/2017");

		Theater t1 = new Theater(101, "DIGI GOLD", "Shirur", m1);
		Theater t2 = new Theater(102, "Phonix", "Pune", m2);
		Theater t3 = new Theater(103, "Morya", "Ranjangaon", m3);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

}
