public class Target {
    public static void main(String[] args) {
        int[] arr  = {10,20,30,40,50,60,70};
         int target  = 60;
         for(int i = 0; i<arr.length; i++){
            for(int j = i+1;j<arr.length;j++)
             if(arr[i] + arr[j]==target){
                 System.out.println("Target found at index: " + arr[i]  +  "and"  + arr[j]);
             System.out.println(i  + " and " + j);
                }
         }
    }

    
}
