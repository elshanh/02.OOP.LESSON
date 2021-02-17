package az.project.lesson04.encapsulation;

public class Student {

	private int		studentId;
	private String	studentFirstName;
	private String	studentLastName;
	private String	studentFaculity;
	

	public Student() {
		
	}

	public Student(int id,String firstName,String lastName,String faculity) {
		
		studentId = id;
		studentFirstName	= firstName;
		studentLastName	=  lastName;
		studentFaculity		= faculity;
	}
	
	public void setStudentId (int id) {
		
		if (id  <= 0) {
			System.out.println("Id Error !");
			studentId = 1;
		}else {
			studentId = id;
		}
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentFirstName (String firstName) {
		
		if (firstName.length() < 3) {
			System.out.println("First Name Error !");
			studentFirstName = "Student Name";
		}else {
			studentFirstName = firstName;
		}
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}	
	public void setStudentLastName (String lastName) {
		
		if (lastName.length() < 3) {
			System.out.println("Last Name Error !");
			studentLastName = "Student LastName";
		}else {
			studentLastName = lastName;
		}
	}
	public String getStudentLastName() {
		return studentLastName;
	}		
	public void setStudentFaculity (String faculity) {
		
		if (faculity.length() < 5) {
			System.out.println("Faculity Error !");
			studentFaculity = "Student Faculity";
		}else {
			studentFaculity = faculity;
		}
	}
	public String getStudentFaculity() {
		return studentFaculity;
	}		
}
