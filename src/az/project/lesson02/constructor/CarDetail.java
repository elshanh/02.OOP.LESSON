package az.project.lesson02.constructor;

public class CarDetail {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		System.out.println("Brand " + car1.brand);
		System.out.println("Model " + car1.model);
		System.out.println("Year " + car1.year);
		System.out.println("Color " + car1.color);
		
		System.out.println("*********************");
		
		Car car2 = new Car("BMW", "F 10", 2015, "White");
		System.out.println("Brand " + car2.brand);
		System.out.println("Model " + car2.model);
		System.out.println("Year " + car2.year);
		System.out.println("Color " + car2.color);
		
	}

}
