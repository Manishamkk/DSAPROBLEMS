

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] =  new int[10];
		System.out.println("Enter the num");
		//user input give
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		//printing the all elemnts
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
