package com.syntax.datatypes;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your salary");
		int salary=scan.nextInt();
		
		if (salary>50000) {
			System.out.println("You can buy a new car");
			System.out.println("how much do you think");
			int carPrice=scan.nextInt();
			if (carPrice<7800) {
				System.out.println("You can buy Audi");
			}
			else if(carPrice<8800) {
				System.out.println("You can buy mercedes benz");
			}
			else if(carPrice<9800) {
				System.out.println("You can buy jaguar");
			}
			else if(carPrice<10800) {
				System.out.println("You can buy Tesla");
			}
			else if(carPrice<6000) {
				System.out.println("save up money and wait until next year");
			}
		}
		else {
			System.out.println("you can buy a used car");
			
		}
	}

}
