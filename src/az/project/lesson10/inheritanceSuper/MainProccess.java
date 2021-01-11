package az.project.lesson10.inheritanceSuper;

import java.util.ArrayList;

public class MainProccess {
	
	public static void main(String[] args) {
		
		ArrayList<String> lessen = new ArrayList<>();
		lessen.add("Lessen 1");
		lessen.add("Lessen 2");
		lessen.add("Lessen 3");
		
		Student student1 = new Student(1, "Irade", "HUSEYNZADA", "Economic", lessen);
		Student student2 = new Student(2, "Akif", "HUSEYNZADA", "Economic", lessen);
		Student student3 = new Student(3, "Fidan", "HUSEYNZADA", "Economic", lessen);
		
		
		
		System.out.println("Name: " +student1.getFirstName());
		System.out.println("Surname: " +student1.getLastName());
		System.out.println("---------------------------------------------------");
		System.out.println("Name: " +student2.getFirstName());
		System.out.println("Surname: " +student2.getLastName());		
		System.out.println("---------------------------------------------------");
		System.out.println("Name: " +student3.getFirstName());
		System.out.println("Surname: " +student3.getLastName());			
		System.out.println("---------------------------------------------------");
		
		
		

	}

}
