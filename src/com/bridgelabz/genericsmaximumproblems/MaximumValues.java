package com.bridgelabz.genericsmaximumproblems;

public class MaximumValues {

	public static String findMax(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {

		String a1 = "cat", b1 = "dog", c1 = "mouse";
		String max1 = findMax(a1, b1, c1);
		System.out.println("Max of " + a1 + ", " + b1 + ", " + c1 + " is " + max1);

		String a2 = "elephant", b2 = "tiger", c2 = "lion";
		String max2 = findMax(a2, b2, c2);
		System.out.println("Max of " + a2 + ", " + b2 + ", " + c2 + " is " + max2);

		String a3 = "pear", b3 = "apple", c3 = "banana";
		String max3 = findMax(a3, b3, c3);
		System.out.println("Max of " + a3 + ", " + b3 + ", " + c3 + " is " + max3);
	}

}
