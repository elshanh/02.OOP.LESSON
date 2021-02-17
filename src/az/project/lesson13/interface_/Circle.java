package az.project.lesson13.interface_;

public class Circle implements Form {
	
	private final double PI = 3.14;
	private double r;
	
	public Circle() {
	}
	public Circle(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double calcArea() {

		return PI * r * r;
	}
	@Override
	public double calcCircle() {

		return 2 * PI * r;
	}	
	
	

}
