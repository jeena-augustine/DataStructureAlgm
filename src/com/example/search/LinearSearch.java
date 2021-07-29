package com.example.search;

public class LinearSearch {

	int[] arr = { 1, 4, 56, 73, 67, 89 };
	int val = 4;

	public static void main(String[] args) {
		LinearSearch sc = new LinearSearch();
		sc.search(sc.arr, sc.val);
	}

	private void search(int[] arr2, int val2) {

		int pos = -1;
		int i = 0;
		while (i < arr.length) {

			if (arr[i] == val2) {
				pos = i;
				System.out.println("Value is present at position= " + pos);
			}
			i++;
		}

		if (pos == -1) {
			System.out.println("Value is not present in the array");
		}
	}

}
