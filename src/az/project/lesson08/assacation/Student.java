package az.project.lesson08.assacation;

import java.util.ArrayList;

public class Student {

	private static String universityName;
	
	private int		studentId;
	private String	studentFirstName;
	private String	studentLastName;
	private String	studentFaculity;
	private ArrayList<String> studentLessen;
	private StudentAddress address;
	
	public Student() {
		
	}

	public Student(int studentId, String studentFirstName, String studentLastName, String studentFaculity,
			ArrayList<String> studentLessen, StudentAddress address) {

		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentFaculity = studentFaculity;
		this.studentLessen = studentLessen;
		this.address = address;
	}

	public static String getUniversityName() {
		return universityName;
	}

	public static void setUniversityName(String universityName) {
		Student.universityName = universityName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
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

	public StudentAddress getAddress() {
		return address;
	}

	public void setAddress(StudentAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentFaculity=" + studentFaculity + ", studentLessen=" + studentLessen
				+ ", address=" + address + "]";
	}
	
	
	
	
}
