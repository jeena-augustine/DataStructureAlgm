package com.example.search;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 45, 56, 12, 23 };
		int val = 45;

		int sc = search(arr, 0, arr.length - 1, val);
		if (sc == -1)
			System.out.println("value not available");
		else
			System.out.println("value available at" + sc);

	}

	private static int search(int[] arr, int big, int end, int item) {
		int mid;
		if (end >= big) {
			mid = big + end - 1 / 2;
			if (arr[mid] == item)
				return mid;
			else if (arr[mid] < item)
				return search(arr, mid + 1, end, item);
			else
				return search(arr, big, mid - 1, item);

		}
		return -1;
	}

}
