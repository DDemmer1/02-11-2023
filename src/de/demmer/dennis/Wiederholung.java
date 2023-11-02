package de.demmer.dennis;

public class Wiederholung {
	

	public static void main(String[] args) {
		
		double euroWert = 20.45;

		double dollar = 0;
		dollar = euroToDollar(20);
		double dollar1 = euroToDollar(345);
		double dollar2 = euroToDollar(456.76);
		double dollar3= euroToDollar(2);
		double dollar4 = euroToDollar(20.45);
		double dollar5 = euroToDollar(20.45);

		int i = myFirstMethod();
		
		myFirstMethod();
		
		
		printFiveTimes("Hallo Welt");

	}

	
	static double euroToDollar(double euro) {
		// euro x 1,06 = dollar
		
		double dollar = euro * 1.06;
		return dollar;
	}
	
	
	static int myFirstMethod() {

		return 5;
	}
	
	
	
	static void printFiveTimes(String toPrint) {
		
		System.out.println(toPrint);
		System.out.println(toPrint);
		System.out.println(toPrint);
		System.out.println(toPrint);
		System.out.println(toPrint);
		
	}
	
	
	
	
	
	

}
