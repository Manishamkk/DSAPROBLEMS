import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
		//o/p { 20 40 60 70 25}
	//	int[] arr  = {20,40,60,70,25,60,40};
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter the arrays elemets:");
		for(int i =0 ;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int n :arr) {
			set.add(n);
		}
		
		for(int n : set) {
			System.out.print( " " + n);
		}
	}
}
