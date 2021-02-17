package az.project.lesson08.assacation;

import java.util.ArrayList;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ArrayList<String> lessen = new ArrayList<>();
		lessen.add("Lessen 1");
		lessen.add("Lessen 2");
		lessen.add("Lessen 3");
		
		StudentAddress address1 = new StudentAddress(2595, "Y.Eliyev", "Baku");
		
		Student student1 = new Student(1, "Irade", "HUSEYNZADA", "Economic", null, null);
		Student student2 = new Student(2, "Akif", "HUSEYNZADA", "Economic", null, null);
		Student student3 = new Student(3, "Fidan", "HUSEYNZADA", "Economic", null, null);
		
		student1.setStudentLessen(lessen);
		student2.setStudentLessen(lessen);
		student3.setStudentLessen(lessen);
		
		student1.setAddress(address1);
		student2.setAddress(address1);
		student3.setAddress(address1);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
	}

}
