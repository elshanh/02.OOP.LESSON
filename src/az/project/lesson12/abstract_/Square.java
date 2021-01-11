package az.project.lesson12.abstract_;

public class Square extends Photo {
	
	private double line;
	
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
	public double getArea() {
		return Math.pow(line, 2);
	}

	@Override
	public double getCircle() {
		return line*4;
	}

}
