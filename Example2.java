package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to validate whether the given day is weekday or weekend day, 
		 * use switch-case control/conditional statement.
		 * 
		 * Note: read the day from the user.
		 */
		
		String day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day: ");
		day = scanner.next();
		
		scanner.close();
		
		switch(day.toLowerCase())
		{
			case "monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":
				System.out.println("weekday...!");
				break;
			
			case "saturday":
			case "sunday":
				System.out.println("weekend...!");
				break;
			
			default:
				System.out.println("enter valid day...!");
		}
		
	}

}
