package com.exampe1;

public class PrintDuplivatesArray {

	public static void main(String[] args) {
		int[] arr =  {10,20,30,2,40,20,60,30};
		int count = 0;
		for(int i =0 ;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					count++;
					break;
				}
			}
		}
		System.out.println( " duplicate num count:"+count);
		
	}
	
}
