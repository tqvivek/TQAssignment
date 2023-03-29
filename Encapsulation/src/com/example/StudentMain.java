package com.example;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1.rollNo);
		// System.out.println(s1.admissionNo);
		System.out.println(s1.age);
		System.out.println(s1.courseId);

		s1.doPublic();
		s1.doProtected();
		s1.doDefault();

	}

}
