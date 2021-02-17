package az.project.lesson09.inheritanceExtends;

public class MainProccess {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setFirstName("Elshan");
		teacher.setLastName("HUSEYNZADA");
		teacher.setTeacherLessen("Finance");
		
		System.out.println("ID: " + teacher.getId());
		System.out.println("Name: " + teacher.getFirstName());
		System.out.println("Surname: " + teacher.getLastName());
		System.out.println("Lessen: " + teacher.getTeacherLessen());
		
		
		System.out.println("----------------------------------------------------");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setFirstName("Irade");
		student1.setLastName("HUSEYNZADA");
		student1.setStudentFaculity("Economic");
		
		System.out.println("ID: " + student1.getId());
		System.out.println("Name: " + student1.getFirstName());
		System.out.println("Surname: " + student1.getLastName());
		System.out.println("Faculity: " + student1.getStudentFaculity());
		System.out.println("-------------------------------");
		
		Student student2 = new Student();
		student2.setId(3);
		student2.setFirstName("Akif");
		student2.setLastName("HUSEYNZADA");
		student2.setStudentFaculity("Economic");
		
		System.out.println("ID: " + student2.getId());
		System.out.println("Name: " + student2.getFirstName());
		System.out.println("Surname: " + student2.getLastName());
		System.out.println("Faculity: " + student2.getStudentFaculity());
		System.out.println("-------------------------------");		
		
		Student student3 = new Student();
		student3.setId(4);
		student3.setFirstName("Fidan");
		student3.setLastName("HUSEYNZADA");
		student3.setStudentFaculity("Economic");
		
		System.out.println("ID: " + student3.getId());
		System.out.println("Name: " + student3.getFirstName());
		System.out.println("Surname: " + student3.getLastName());
		System.out.println("Faculity: " + student3.getStudentFaculity());
		System.out.println("-------------------------------");				

	}

}
