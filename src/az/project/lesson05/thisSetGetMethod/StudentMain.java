package az.project.lesson05.thisSetGetMethod;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudentId(1);
		student.setStudentFirstName("Elshan");
		student.setStudentLastName("HUSEYNZADA");
		student.setStudentFaculity("Economic");
		
		System.out.println("<***> <***> <***> <***> <***> <***> <***>");
		
		System.out.println("ID => " + student.getStudentId());
		System.out.println("Name => " + student.getStudentFirstName());
		System.out.println("Surname => " + student.getStudentLastName());
		System.out.println("Faculity => " + student.getStudentFaculity());
		
	}

}
