package com.practice.program;

import java.util.Arrays;

public class PrintMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 3, 4, 6, 8, 7, 9 };
		int count = 0;
		Arrays.sort(arr);

		int lastNum = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {

			count = count + arr[i];

		}

		int nSum = lastNum * (lastNum + 1) / 2;

		int missingNumber = nSum - count;

		System.out.println(missingNumber);

	}

}
