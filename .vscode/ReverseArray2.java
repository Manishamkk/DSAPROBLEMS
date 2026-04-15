import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the range:");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter elements: ");
		for(int i =0 ;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}
}
