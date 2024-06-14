package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to validate whether the given day is weekday or weekend day, 
		 * use switch-case expression.
		 * 
		 * Note: read the day from the user.
		 */
		
		String day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day: ");
		day = scanner.next().toLowerCase();
		
		scanner.close();
		
		String output = switch(day)
		{
			
			case "monday", "tuesday", "wednesday", "thursday", "friday" -> "weekday...!";
			
			case "saturday", "sunday" -> "weekend...!";
			
			default -> "enter valid day...!";
			
		};
		
		System.out.println(output);
		
	}

}
