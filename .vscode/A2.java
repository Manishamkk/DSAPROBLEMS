public class A2 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,4,5,6,7};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < arr[i + 1]){
         System.out.println(arr[i]);
            }
        }
    }
    
}
