
import java.util.Scanner;


//INPUT 1234
//OUTPUT =10
public class SumOfDigit{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        while(num>0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        
        }
System.out.println("Sum of given numbers is : " + sum);
    }
}