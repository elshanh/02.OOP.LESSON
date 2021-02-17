package az.project.lesson02.constructor;

public class Car {

	String brand;
	String model;
	String color;
	int year;
	
	public Car() {
		brand = "Mercedes Benz";
		model = "VIP Class";
		year  = 2020;
		color = "red";
	}
	
	public Car(String valueBrand,String valueModel,int valueYear,String valueColor) {
		brand		= valueBrand;
		model		= valueModel;
		year			= valueYear;
		color			= valueColor;
	}	
}
