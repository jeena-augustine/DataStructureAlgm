package com.example.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr= {45,12,34,56,1,3,2};
		for(int k=1;k<arr.length;k++){
			
			int temp=arr[k];
			int j=k-1;
			while(j>=0 && arr[j]>=temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
