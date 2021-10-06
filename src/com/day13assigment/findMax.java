package com.day13assigment;

	import java.util.Arrays;

	public class findMax<T extends Comparable<T>> {
		T[] parameter;

		public findMax(T[] parameter) {
			this.parameter = parameter;
		}

		public static <T> void printMax(T[] parameter, T maximum) {
			for (T i : parameter) {
				System.out.println(i);
			}
			System.out.printf("maximum of array is: ", maximum, parameter);
		}

		/*
		 * Purpose - Used Generic method to find maximum values
		 * 
		 * @parameter - parameters
		 */

		public static <T extends Comparable<T>> T maximum(T[] parameter) {
			Arrays.sort(parameter);
			int length = parameter.length;
			T max = parameter[length - 1];
			
			/*max = parameter[0];
			for (T element : parameter) {
		        if (element.compareTo(max) > 0) {
		            max = element;
		        }
		    }*/
		    printMax(parameter, max);
		    return max;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Integer[] maximumOFintegers = { 16, 34, 15, 32, 41, 67, 5, 59 };
			System.out.println("The maximum of integers is : " + maximum(maximumOFintegers));
			Float[] maximumOfFloat = { 1.3f, 4.5f, 6.7f, 7.8f, 3.3f, 2.9f, 9.0f, 1.8f };
			System.out.println("The maximum of floats is : " + maximum(maximumOfFloat));
			String[] maximumOfString = { "zzzz", "pqr", "xyz", "ijk", "stu", "ijk", "efg", "mno" };
			System.out.println("The maximum of strings is : " + maximum(maximumOfString));

		}

	}