package com.prabhat.training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		String regex = "^(.+)@(.+)$";
		// initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static void main(String[] args) {

		System.out.println("Enter any email address to check");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

	}


}
