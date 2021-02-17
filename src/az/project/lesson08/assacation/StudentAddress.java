package az.project.lesson08.assacation;

public class StudentAddress {
	
	private int		studentAddressNo;
	private String	studentAddressStreet;
	private String	studentAddressCity;
	
	public StudentAddress() {
		
	}

	public StudentAddress(int studentAddressNo, String studentAddressStreet, String studentAddressCity) {
		this.studentAddressNo = studentAddressNo;
		this.studentAddressStreet = studentAddressStreet;
		this.studentAddressCity = studentAddressCity;
	}

	public int getStudentAddressNo() {
		return studentAddressNo;
	}

	public void setStudentAddressNo(int studentAddressNo) {
		this.studentAddressNo = studentAddressNo;
	}

	public String getStudentAddressStreet() {
		return studentAddressStreet;
	}

	public void setStudentAddressStreet(String studentAddressStreet) {
		this.studentAddressStreet = studentAddressStreet;
	}

	public String getStudentAddressCity() {
		return studentAddressCity;
	}

	public void setStudentAddressCity(String studentAddressCity) {
		this.studentAddressCity = studentAddressCity;
	}

	public String toString() {
		return "StudentAddress [studentAddressNo=" + studentAddressNo + ", studentAddressStreet=" + studentAddressStreet
				+ ", studentAddressCity=" + studentAddressCity + "]";
	}
	
	
	
}
