package com.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {
	//import java.util.Scanner;

	//public class IntegerDivision {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the dividend: ");
	        int dividend = scanner.nextInt();
	        
	        System.out.print("Enter the divisor: ");
	        int divisor = scanner.nextInt();
	        
	        int quotient = 0;
	        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
	        
	        dividend = Math.abs(dividend);
	        divisor = Math.abs(divisor);
	        
	        while (dividend >= divisor) {
	            dividend -= divisor;
	            quotient++;
	        }
	        
	        System.out.println("Quotient: " + (sign * quotient));
	    
	}
}


	

	

	
	
	
	

	
	


