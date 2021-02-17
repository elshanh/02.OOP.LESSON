package az.project.lesson07.final_;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setStudentId(1);
		student1.setStudentFirstName("Irade");
		student1.setStudentLastName("HUSEYNZADA");
		student1.setStudentFaculity("Economic");
		
		System.out.println("University Name => " + Student.universityName);
		System.out.println("<***> <***> <***> <***> <***> <***> <***>");
		
		System.out.println("ID => " + student1.getStudentId());
		System.out.println("Name => " + student1.getStudentFirstName());
		System.out.println("Surname => " + student1.getStudentLastName());
		System.out.println("Faculity => " + student1.getStudentFaculity());
		
		System.out.println("--------------------------------------");
		
		Student student2 = new Student();
		
		student2.setStudentId(2);
		student2.setStudentFirstName("Akif");
		student2.setStudentLastName("HUSEYNZADA");
		student2.setStudentFaculity("Economic");
		
		System.out.println("<***> <***> <***> <***> <***> <***> <***>");
		
		System.out.println("ID => " + student2.getStudentId());
		System.out.println("Name => " + student2.getStudentFirstName());
		System.out.println("Surname => " + student2.getStudentLastName());
		System.out.println("Faculity => " + student2.getStudentFaculity());
		
		System.out.println("--------------------------------------");
		
		Student student3 = new Student();
		
		student3.setStudentId(3);
		student3.setStudentFirstName("Fidan");
		student3.setStudentLastName("HUSEYNZADA");
		student3.setStudentFaculity("Economic");
		
		System.out.println("<***> <***> <***> <***> <***> <***> <***>");
		
		System.out.println("ID => " + student3.getStudentId());
		System.out.println("Name => " + student3.getStudentFirstName());
		System.out.println("Surname => " + student3.getStudentLastName());
		System.out.println("Faculity => " + student3.getStudentFaculity());			
		
	}

}
