package studio7;

public class Die {

	private int n;
	
	public Die(int initN) {
		this.n = initN;
	}
	
	public int Roll() {
		return (int) (Math.random()*this.n) + 1;
	}
	
	public String ToString() {
		return "Number of sides: " + this.n + " Roll: " + Roll();
	}
	


	public static void main(String[] args) {
		
		Die n1 = new Die((int) (Math.random()*10));
		System.out.println(n1.ToString());
		
	}
}