package com.syntax.datatypes;

import java.util.Scanner;

public class BeginnerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter your level");
		
		int level=scan.nextInt();
		String levelName;
		switch(level) {
		
		case 1:
		levelName="Beginner";
		break;
		case 2:
			levelName="Intermadiate";
			break;
		case 3:
			levelName="Expert";
			break;
			default:
				levelName="invalid";
				break;
		}
	}

}
