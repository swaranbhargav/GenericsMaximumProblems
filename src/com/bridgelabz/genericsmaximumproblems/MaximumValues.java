package com.bridgelabz.genericsmaximumproblems;

public class MaximumValues {

	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		T max = a;
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

		Float a2 = 3.5f, b2 = 5.2f, c2 = 2.8f;
		Float max2 = findMax(a2, b2, c2);
		System.out.println("Max of " + a2 + ", " + b2 + ", " + c2 + " is " + max2);

		Integer a3 = 10, b3 = 5, c3 = 20;
		Integer max3 = findMax(a3, b3, c3);
		System.out.println("Max of " + a3 + ", " + b3 + ", " + c3 + " is " + max3);
	}

}
