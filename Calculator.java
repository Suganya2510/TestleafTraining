package week3.day1;

public class Calculator {
	
	public void add (int x, int y) {
		System.out.println(x+y);

	}
	public void add (int x, int y,int z) {
		System.out.println(x+y+z);
}
	public void multiply(int x, int y) {
		System.out.println(x*y);

	}
	public void multiply(int x, double y) {
		System.out.println(x*y);
}
	
	public void subtract(int x, int y) {
		System.out.println(x-y);

	}
	public void subtract(double x, double y) {
		System.out.println(x-y);
}

	public void divide(int x, int y) {
		System.out.println(x/y);

	}
	public void divide(double x, int y) {
		System.out.println(x/y);
}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10, 5);
		cal.add(10, 3, 6);
		cal.multiply(10, 5);
		cal.multiply(10, 20.10);
		cal.subtract(11, 3);
		cal.subtract(20.5, 10.3);
		cal.divide(10, 2);
		cal.divide(25.3, 2);
		
	}
}

