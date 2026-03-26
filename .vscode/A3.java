public class A3 { 
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,5,3,2,8,9,0};
        int target1 = 5;
        int target2 =10;
        for(int i = 0 ;i<arr.length;i++){
            for(int j =i+1 ;j<arr.length;j++){
                if(arr[i] + arr[j] == target1){
                    System.out.println( " target1" + i + " and " + j);
                }if(arr[i] + arr[j] ==target2){
                    System.out.println(  " target1" +i + "and " + j);
                }
            }

           
        }
    }

    
}
