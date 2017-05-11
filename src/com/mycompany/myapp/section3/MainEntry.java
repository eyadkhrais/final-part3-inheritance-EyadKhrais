package com.mycompany.myapp.section3;

public class MainEntry {

	public static void main(String[] args) {
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("eyad", "java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("Person one Name: " + p1.getName());
		System.out.println("Person two Name: " + p2.getName());

	}

}
