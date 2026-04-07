import java.util.Arrays;
import java.util.Scanner;

public class SalesMerchant {


    public static int salesMerchant(int  n , int[] arr){
        int pairs = 0;
        Arrays.sort(arr);
        for(int i =1;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                pairs++;
                i++;
            }
        }
        return pairs;
    }
   public static void main(String[] args) {
    Scanner  sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(salesMerchant(n,arr));
   } 
}
