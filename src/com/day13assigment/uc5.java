package com.day13assigment;

import java.util.Scanner;

public class uc5 {
	private static <T extends Comparable<T>> void compareTo(T s1, T s2, T s3) {
		// TODO Auto-generated method stub
		T max = s1;

		if (s2.compareTo(max) > 0) {
			max = s2;
		}
		if (s3.compareTo(max) > 0) {
			max = s3;
		}
		System.out.println("The maximum among three is : " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a, b, c;
		Float F1, F2, F3;
		String S1, S2, S3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three integers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		compareTo(a, b, c);
		System.out.println("Enter the three floats");
		F1 = sc.nextFloat();
		F2 = sc.nextFloat();
		F3 = sc.nextFloat();
		compareTo(F1, F2, F3);
		System.out.println("Enter the three strings");
		S1 = sc.next();
		S2 = sc.next();
		S3 = sc.next();
		compareTo(S1, S2, S3);
		sc.close();
	}
}


