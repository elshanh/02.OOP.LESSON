package az.project.lesson01.start;

public class CarDetail {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.brand = "Mercedes Benz";
		car.model = "VIP Class";
		car.year  = 2020;
		car.color = "red";
		
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		
	}

}
