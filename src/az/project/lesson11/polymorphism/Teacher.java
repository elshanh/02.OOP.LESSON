package az.project.lesson11.polymorphism;

public class Teacher extends Person{

	private String	teacherLessen;
	
	public Teacher() {
		
	}
	
	public Teacher(int id,String name,String lastName,String lessen) {
		super(id, name, lastName);
		this.teacherLessen = lessen;
	}	

	public String getTeacherLessen() {
		return teacherLessen;
	}

	public void setTeacherLessen(String teacherLessen) {
		this.teacherLessen = teacherLessen;
	}

	@Override
	public String toString() {
		return "Teacher [teacherLessen=" + teacherLessen + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + "]";
	}
	
}
