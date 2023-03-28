package com.demo;

public class BookTest {

	public static void main(String[] args) {

		Author a1 = new Author(1, "Vivek", "16/07/2001");
		Author a2 = new Author(2, "Suyog", "13/05/2001");
		Author a3 = new Author(3, "Sane Guruji", "7/07/1890");

		Book b1 = new Book("Vivek's story", 15f, "Biography", a1);
		Book b2 = new Book("Jokes book", 17f, "Comedy", a2);
		Book b3 = new Book("Shyamchi Aai", 20f, "Biography", a3);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
