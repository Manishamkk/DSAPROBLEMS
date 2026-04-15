public class SortedArray {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6};
		boolean isSorted =true;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println(arr[i]);
				isSorted =false;
		}
	}
	System.out.println(isSorted? "sorted" :" not sorted");
	}

}
