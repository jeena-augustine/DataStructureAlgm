package com.example.search;

public class BinarySearch {

	int binarySearch(int arr[], int big, int end, int item) {
		if (end >= big) {
			int mid = big + (end - big) / 2;

			if (arr[mid] == item)
				return mid;

			if (arr[mid] > item)
				return binarySearch(arr, big, mid - 1, item);

			return binarySearch(arr, mid + 1, end, item);
		}

	
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
