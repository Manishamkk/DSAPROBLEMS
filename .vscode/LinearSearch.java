import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =  new Scanner(System.in);
		int[] arr = new int[10];
		boolean found =false;
		System.out.println("enter the array elements:");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the key");
		int key = sc.nextInt();
		for(int i =1 ;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
		}
		
	}

}
