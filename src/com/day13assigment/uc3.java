package com.day13assigment;

import java.util.Scanner;

public class uc3 {
	private static void compareTo(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		String max = s1;
		
		if(s2.compareTo(max) > 0) {
			max = s2;
		}
		if (s3.compareTo(max) > 0) {
			max = s3;
		}
		System.out.println("The maximum string is : "+max);
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to find maximum of three string");
		String a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of a");
		a = sc.next();
		System.out.println("Enter the string of b");
		b = sc.next();
		System.out.println("Enter the string of c");
		c = sc.next();
		sc.close();
		compareTo(a, b, c);
		
	}

}


