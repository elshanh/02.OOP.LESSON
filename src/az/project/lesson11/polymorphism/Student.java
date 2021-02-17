package az.project.lesson11.polymorphism;

import java.util.ArrayList;

public class Student extends Person{

	private String	studentFaculity;
	
	private ArrayList<String> studentLessen;
	
	public Student() {
		
	}
	
	public Student(int id,String name,String lastName,String faculity,ArrayList<String> lessen) {
		super(id, name, lastName);
		this.studentFaculity = faculity;
		this.studentLessen = lessen;
	}

	public String getStudentFaculity() {
		return studentFaculity;
	}

	public void setStudentFaculity(String studentFaculity) {
		this.studentFaculity = studentFaculity;
	}

	public ArrayList<String> getStudentLessen() {
		return studentLessen;
	}

	public void setStudentLessen(ArrayList<String> studentLessen) {
		this.studentLessen = studentLessen;
	}

	@Override
	public String toString() {
		return "Student [studentFaculity=" + studentFaculity + ", studentLessen=" + studentLessen + ", getId()="
				+ getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}


	
}
