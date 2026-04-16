

public class AbsentNumFind {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9};
		int n =8;
		int sum = n*(n+1)/2;
		int arrSum = 0;
		for(int i= 0;i<arr.length;i++) {
			arrSum+=i;
		}
		int result = sum-arrSum;
		System.out.println(result);
		
	}
	
}
