package az.project.lesson11.polymorphism;

import java.util.ArrayList;

public class MainProccess {
	
	public static void main(String[] args) {
		
		ArrayList<String> lessen = new ArrayList<>();
		lessen.add("Lessen 1");
		lessen.add("Lessen 2");
		lessen.add("Lessen 3");
		
		Teacher teacher = new Teacher(11, "Elshan", "HUSEYNZADA", "Finance");
		
		Student student1 = new Student(22, "Irade", "HUSEYNZADA", "Economic", lessen);
		Student student2 = new Student(33, "Akif", "HUSEYNZADA", "Economic", lessen);
		Student student3 = new Student(44, "Fidan", "HUSEYNZADA", "Economic", lessen);
		
		personInfoShow(teacher);
		personInfoShow(student1);
		personInfoShow(student2);
		personInfoShow(student3);
		
		
		
		/*
		System.out.println("Name: " +student1.getFirstName());
		System.out.println("Surname: " +student1.getLastName());
		System.out.println("---------------------------------------------------");
		System.out.println("Name: " +student2.getFirstName());
		System.out.println("Surname: " +student2.getLastName());		
		System.out.println("---------------------------------------------------");
		System.out.println("Name: " +student3.getFirstName());
		System.out.println("Surname: " +student3.getLastName());			
		System.out.println("---------------------------------------------------");*/
		
	}
	
	public static void personInfoShow(Person person) {
		System.out.println("Name: " +person.getFirstName());
		System.out.println("Surname: " +person.getLastName());
	}

}
