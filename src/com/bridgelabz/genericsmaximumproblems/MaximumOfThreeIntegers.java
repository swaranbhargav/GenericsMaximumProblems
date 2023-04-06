package com.bridgelabz.genericsmaximumproblems;

public class MaximumOfThreeIntegers {
	public static Integer findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {

		Integer a1 = 10, b1 = 5, c1 = 2;
		Integer max1 = findMax(a1, b1, c1);
		System.out.println("Max of " + a1 + ", " + b1 + ", " + c1 + " is " + max1);

		Integer a2 = 8, b2 = 20, c2 = 3;
		Integer max2 = findMax(a2, b2, c2);
		System.out.println("Max of " + a2 + ", " + b2 + ", " + c2 + " is " + max2);

		Integer a3 = 7, b3 = 6, c3 = 9;
		Integer max3 = findMax(a3, b3, c3);
		System.out.println("Max of " + a3 + ", " + b3 + ", " + c3 + " is " + max3);
	}

}
