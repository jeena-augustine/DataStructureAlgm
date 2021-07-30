package com.example.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 45, 23, 33, 10, 3 };
		int[] arr1 = bubbleSort(arr);
		System.out.println("Final Array= " + Arrays.toString(arr1));
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
			System.out.println("After each swapping");
			System.out.println(Arrays.toString(arr));
		}

		return arr;
	}
}
