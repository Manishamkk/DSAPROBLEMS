
import java.util.Scanner;

public class FirstLargestNumber {
    public static void main(String[] args) {
       // int[] arr = {10,30,50,60,20,30};
       System.out.println("Enter the element :");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr =  new int[n];
       System.out.println("Enter the elements in array:");
       for(int i = 0 ;i<n;i++)
{
     arr[i] = sc.nextInt();
}       

        int max = arr[0];
        for(int i =0;i<arr.length;i++){
           if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("First largest number is: " + max);
    }
    
}
