package az.project.lesson13.interface_;

public class MainProccess {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(3.15);
		Square square = new Square(5);
		
		calcArea(square);
		System.out.println("**********************");
		calcArea(circle);
	}
	
	public static void calcArea(Form form) {
		System.out.println("Area: " + form.calcArea());
		System.out.println("Circle: " + form.calcCircle());
	}

}
