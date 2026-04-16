

public class Array1 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int max1=0;
		int max2=2;
		
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 =arr[i];
			}else if(arr[i]>max1 && arr[i]!=max1) {
				max2 = arr[i];
			}
		}
		System.out.println("second large :" + max2);
	}
}
