package com.example.sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 1, 56, 89, 34, 56, 34, 21, 2, 5, 7 };

		System.out.println("After sorting =" + Arrays.toString(shellSort(arr)));
	}

	private static int[] shellSort(int[] arr) {
		int i, j, k, tmp;
		for (i = arr.length / 2; i > 0; i = i / 2) {
			for (j = i; j < arr.length; j++) {
				for (k = j - i; k >= 0; k = k - i) {
					if (arr[k + i] >= arr[k])
						break;
					else {
						tmp = arr[k];
						arr[k] = arr[k + i];
						arr[k + i] = tmp;
					}

				}
			}
		}

		return arr;
	}

}
