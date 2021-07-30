package com.example.search;

public class BinarySearch {

	int binarySearch(int arr[], int big, int end, int x) {
		if (end >= big) {
			int mid =big+(end - big )/ 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)
				return binarySearch(arr, big, mid - 1, x);
			else
				return binarySearch(arr, mid + 1, end, x);
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n-1 , x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
