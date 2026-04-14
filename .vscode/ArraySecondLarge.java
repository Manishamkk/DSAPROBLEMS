//        input:7
//        array  45 67 89 65 43 89 76
//        output : 76
//
import java.util.Scanner;

public class ArraySecondLarge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largets =0;
        int secLargest =0;
        System.out.println("enter the array elemnts:");
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i<n;i++){
            if(arr[i]>largets){
                secLargest = largets;
                largets= arr[i];
            } else if (arr[i]>secLargest && arr[i]!= largets) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }}