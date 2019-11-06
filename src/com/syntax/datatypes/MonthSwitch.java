package com.syntax.datatypes;

import java.util.Scanner;

public class MonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a month mumber");
		
		int month=scan.nextInt();
		String monthName;
		switch(month) {
		
		case 1:
		monthName="Januarye";
		break;
		
		case 2:
			monthName="February";
			break;
		case 3:
			monthName="March";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="june";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="september";
			break;
		case 10:
			monthName="October";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			break;
			
			default:
			monthName="Invalid";
					break;
		}
		
		System.out.println("you are in "+monthName);
	}

}
