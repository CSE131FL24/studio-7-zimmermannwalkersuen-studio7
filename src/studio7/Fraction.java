package studio7;

public class Fraction {

	private double numerator;
	private double denomenator;
	
	public Fraction(double initNumerator, double initDenomenator) {
		this.numerator = initNumerator;
		this.denomenator = initDenomenator;
	}
	
	public double getNumerator() {
		return this.numerator;
	}
	public double getDenomenator() {
		return this.denomenator;
	}
	
	public double Sum(Fraction n2) {
		return (this.numerator / this.denomenator) + (n2.getNumerator()/n2.getDenomenator());
	}
	
	public double Product(Fraction n2) {
		return (this.numerator / this.denomenator) * (n2.getNumerator()/n2.getDenomenator());
	}
	
	public String Reciprocal() {
		return this.denomenator + "/" + this.numerator;
	}
	
	public String Simplify() {
		
		double n = this.numerator;
		double d = this.denomenator;
		
	for(int i=0; i <= Math.max(this.numerator,this.denomenator); i++) { 	
		
		if (n % i == 0 && d % i == 0) {
			n /= i;
			d /= i;
		}
	}
		return n + "/" + d;
	}
	
	public String toString() {
		return "Fraction " + this.numerator + "/" + this.denomenator;
	}
	
	public static void main(String[] args) {
		
		Fraction Test1 = new Fraction(6,4);
		System.out.println(Test1.toString());
		System.out.println("Simplified: " + Test1.Simplify());
		
	}
	
}
