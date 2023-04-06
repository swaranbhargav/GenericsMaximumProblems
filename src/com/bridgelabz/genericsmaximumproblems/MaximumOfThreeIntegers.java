package com.bridgelabz.genericsmaximumproblems;

public class MaximumOfThreeIntegers {

	public static Float findMax(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		// Test case 1: max at 1st position
		Float a1 = 10.5f, b1 = 5.8f, c1 = 2.7f;
		Float max1 = findMax(a1, b1, c1);
		System.out.println("Max of " + a1 + ", " + b1 + ", " + c1 + " is " + max1);

		// Test case 2: max at 2nd position
		Float a2 = 8.3f, b2 = 20.1f, c2 = 3.9f;
		Float max2 = findMax(a2, b2, c2);
		System.out.println("Max of " + a2 + ", " + b2 + ", " + c2 + " is " + max2);

		// Test case 3: max at 3rd position
		Float a3 = 7.2f, b3 = 6.1f, c3 = 9.8f;
		Float max3 = findMax(a3, b3, c3);
		System.out.println("Max of " + a3 + ", " + b3 + ", " + c3 + " is " + max3);
	}
}
