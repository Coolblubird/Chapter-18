//Jordan Ashe

import java.util.Scanner;

public class eightteenDashThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("GREATEST COMMON DIVISOR");
		
		System.out.println("Please input a number.");
		double temp1 = input.nextDouble();
		
		System.out.println("Please input another number.");
		double temp2 = input.nextDouble();
		
		System.out.println("your total is: " + gcd(temp1,temp2));
	}
	
	
	public static double gcd(double m, double n){
		if (m%n==0){
			return n;
		}
		else{
			return gcd(n, m%n);
		}
	}
}