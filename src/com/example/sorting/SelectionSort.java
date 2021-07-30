package com.example.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {1,45,32,12,67,89,66};
		int i,pos;
		for(i=0;i<arr.length;i++) {
			pos=smallest(arr,i);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static int smallest(int[] arr, int i) {
		int small=arr[i];
		int pos=i;
		for(int j=i;j<arr.length;j++) {
			if(arr[j]<small) {
				small=arr[j];
				pos=j;
			}
		}
		return pos;
	}

}
