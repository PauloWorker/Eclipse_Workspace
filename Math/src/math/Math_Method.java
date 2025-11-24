package math;

public class Math_Method {
	public static void main(String[] args) {
		double x = 3.14; 
		double y = -10;
		
		double minimal = Math.min(x, y);
		double maximum = Math.max(x, y);
		double absolute = Math.abs(y);
		double round = Math.round(x);
		double ceil = Math.ceil(x);
		double floor = Math.floor(x);
		
		System.out.println("Math.min used to return the minimal: " + minimal);
		System.out.println("Math.max used to return the maximum: " + maximum);
		System.out.println("Math.abs used to return the positive value never the negative: " + absolute);
		System.out.println("Math.round used to round a broken value like 3.14 to 3.0: " + round);
		System.out.println("Math.ceil used to round up a broken value like 3.14 to 4.0: " + ceil);
		System.out.println("Math.floor used to round down a broken value like 3.14 to 3.0: " + floor);
	}
}
