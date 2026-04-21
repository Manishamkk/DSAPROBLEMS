
import java.util.Scanner;

public class RemoveDupWithoutSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the arrays elemntrs:");
		for(int i =0 ;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ;i<arr.length;i++) {
			boolean isDuplicate = false;
			for(int j =0 ;j<i ;j++) {
				if(arr[i] ==arr[j]){
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(" " +arr[i]);
			}
		}
		
	}
}
