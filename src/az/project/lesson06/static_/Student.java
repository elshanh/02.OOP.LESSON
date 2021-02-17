package az.project.lesson06.static_;

public class Student {

	private static String universityName;
	
	private int		studentId;
	private String	studentFirstName;
	private String	studentLastName;
	private String	studentFaculity;
	
	public Student() {
		
	}
	
	public Student(int id,String firstName,String lastName,String faculity) {
		
		this.studentId = id;
		this.studentFirstName	= firstName;
		this.studentLastName	=  lastName;
		this.studentFaculity		= faculity;
	}
	
	public static void setUniversityName(String universityName) {
		Student.universityName = universityName;
	}
	public static String getUniversityName() {
		return universityName;
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
	

}
