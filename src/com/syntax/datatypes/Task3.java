package com.syntax.datatypes;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		
		
				System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		
		
		
		System.out.print("Enter the operator:");
		
		String operator=scan2.next();
		
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();			

		
		if (operator.equals("+")) {
			System.out.println(num1+num2);
		}
		
		else if (operator.equals("-")) {
			System.out.println(num1-num2);
		}
		
		else if (operator.equals("/")) {
			System.out.println(num1/num2);
		}
		
		else if (operator.equals("*")) {
			System.out.println(num1/num2);
		}
		
		else {
			System.out.println("Invalid operator or number");
		}
		
			
		

	
	
	
	}

}
