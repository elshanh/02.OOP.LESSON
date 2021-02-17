package az.project.lesson12.abstract_;

public class MainProccess {
	
	public static void main(String[] args) {
		
		Square square = new Square(4);
		
		System.out.println("Area " + square.getArea());
		System.out.println("Circle " + square.getCircle());
		
	}

}
