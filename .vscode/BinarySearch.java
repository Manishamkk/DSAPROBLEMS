

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the range:");
		int n = sc.nextInt();
		System.out.println("enter the array elements:");
		int[] arr = new int[n];
				for(int i =0 ;i<arr.length;i++) {
					arr[i]= sc.nextInt();
				}
				System.out.println("enter the key:");
			int key = sc.nextInt();
				int low =0;
				int high =n-1;
				int index = -1;
				
				while(low<=high) {
					int mid = (low+high)/2;
					if(arr[mid]==key) {
						index =mid;
						break;
					}else if(arr[mid]<key) {
						low = mid+1;
					}else {
						high = mid-1;
					}
				}
		
		if(index!=-1) {
			System.out.println("index of key is :" + index);
		}else {
			System.out.println("not found");
		}
		
	}

}
