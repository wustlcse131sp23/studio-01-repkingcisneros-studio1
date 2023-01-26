package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year?");
		int year = in.nextInt();
		boolean leapYear0 = year % 4 == 0;
		boolean leapYear1 = year % 100 > 0;
		boolean leapYear2 = year % 400 == 0;
		boolean leapYear3 = (leapYear0 && leapYear1) || leapYear2;
		System.out.println(year + " is a leap year: " + leapYear3);
				
	}

}
