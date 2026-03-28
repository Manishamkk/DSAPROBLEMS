import java.util.Scanner;
public class MissingNumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the number :");
	        int n = sc.nextInt();

	        int sum = n * (n + 1) / 2;
	        int arrSum = 0;

	        for(int i=1;i<n;i++){
	            arrSum += sc.nextInt();
	        }

	        System.out.println(sum - arrSum);
	    }
}
