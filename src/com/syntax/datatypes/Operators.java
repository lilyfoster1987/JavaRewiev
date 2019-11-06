package com.syntax.datatypes;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int num=45;


		if (num>1 && num <10) {
		      System.out.println("this number is small");
		      // true AND false --> false
		      }else if (num>=10 && num<100) {
		      System.out.println("this number is medium");
		      //true AND true --> true
		      }else if (num>=100 && num <1000) {
		      System.out.println("this number is large");
		      }else {
		      System.out.println("Number is out of our the range");
		      }
		
*/
double a;
a=78;

if(a%2==0) {
	System.out.println("it is even number");
}
else {
	System.out.println("it is odd number");
}


		double x,y,z;
		x=86;
		y=72;
		z=95;
		if(x>y && x>z) {
			
				System.out.println("large number is "+x);
			}
		else if(y>x && y>z) {
			System.out.println("large number is "+y);
			
		}
		else {
			System.out.println("large number is "+z);
		}
		
		
	}

}
