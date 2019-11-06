package com.syntax.datatypes;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number ");	
		int number1=scan.nextInt();
		
if(number1<100) {
	if (number1>=10) {
	System.out.println("it is 2 digit");
}
}
else if(number1<1000) {
	if(number1>=100) {
	System.out.println("it is 3 digit");
	
}
}
	
else if(number1<10000) {
	if(number1>=1000) {
	System.out.println("it is 4 digit");
	
	
	}
	}

else {
	System.out.println("it can  be 5 digit or ...");
}
	}


	}


