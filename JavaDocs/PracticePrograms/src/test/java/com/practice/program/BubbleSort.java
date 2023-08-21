package com.practice.program;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 9, 1, 8, 3, 44, 2, 12, 55, 90, 3, 0 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
