
import java.util.Scanner;

public class DuplicateNumCound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num range:");
		int n = sc.nextInt();
		System.out.println("enter the array ele:");
		int[] arr = new int[n];
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("enter the kay:");
		int kay = sc.nextInt();
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]==kay) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
