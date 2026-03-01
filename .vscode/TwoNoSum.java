//two number sum of given program 
//input  int[] array={2,4,6,7,8,9,45}    target = 10
//output = [1,2]   beacause 2=6 = 10
public class TwoNoSum {
    public static void main(String[] args) {
         int array[] = {2,4,6,7,8,9,45};
         int target = 10;

         for(int i = 0;i<= array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i] +array[j] ==target){
                    System.out.println("inderx of first:" + i + " and " + "index of j :" + j);
                }

            }
    }
    
    }}
