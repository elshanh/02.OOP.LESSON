package az.project.lesson13.interface_;

public class Square implements Form{
	
	private double line;
	
	public Square() {

	}
	
	public Square(double line) {
		this.line = line;
	}

	
	

	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}

	@Override
	public double calcArea() {
		
		return line * line;
	}

	@Override
	public double calcCircle() {

		return line * 4;
	}

}
