package com.syntax.datatypes;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		
		
		
		/*System.out.println("enter name");
		String name=scan.next();
		
		System.out.print("hey"+name);
		
		
	
		String name="john";
		String name2="john";
		System.out.println(name.equals(name2));
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter first number");
		int num1=scan.nextInt();
		
		System.out.print("enter in operator");
		String operator=scan.next();
		
		
		System.out.print("enter second number");
		int num2=scan.nextInt();
		
		if(operator.contentEquals("+")) {
			
			System.out.println(num1+num2);
		}
		
		else if(operator.contentEquals("-")) {
			
		System.out.println(num1-num2);
		}
		
		else if(operator.contentEquals("/")) {
			
			System.out.println(num1/num2);
		}
		else if(operator.contentEquals("*")){
				System.out.println(num1*num2);
	}
		
		else {
			System.out.println(num1%num2);
		}

}
	
}
*/
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number=scan.nextInt();
		
		if (number>=10) {
			if (number<100) {
				System.out.println("The number is two digits");
			}
		}else if (number>=100) {
			if (number<1000) {
				System.out.println("The number is three digits");
			}			
		}else if (number>=1000) {
			if (number<10000) {
				System.out.println("The number is four digits");
			}
		}else {
			System.out.println("error");
		}
	}
}