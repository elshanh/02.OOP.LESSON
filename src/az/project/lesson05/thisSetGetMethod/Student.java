package az.project.lesson05.thisSetGetMethod;

public class Student {

	private int		studentId;
	private String	studentFirstName;
	private String	studentLastName;
	private String	studentFaculity;
	
	
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
