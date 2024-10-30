package studio7;

public class Rectangle {
	
	private double width;
	private double length;

	
	public Rectangle(double initLength, double initWidth) {
		
		this.width = initWidth;
		this.length = initLength;
	}
		
	public double CalculateArea() {	
		return this.length*this.width;
	}
		
	public double CalculatePerimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean isBigger(Rectangle r2) {
		
		if (this.CalculateArea() > r2.CalculateArea()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString() 
    { 
      return "Length = " + this.length + " Width = " + this.width + " Area = " + CalculateArea() + " Perimeter = " + CalculatePerimeter() + " isSquare = " + isSquare();
    }
	
	
	public static void main(String[] args) {
		
		Rectangle Test1 = new Rectangle(2,3);
		System.out.println("Test1: " + Test1.toString());
		
		Rectangle Test2 = new Rectangle(4,4);
		System.out.println("Test2: " + Test2.toString());
		
		System.out.println("Is Test1 bigger than Test2: " + Test1.isBigger(Test2));
		
	}
	
	
}

