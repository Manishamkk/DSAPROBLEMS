
import java.util.Scanner;
public class DiscountInEmp {
    	public static void main(String[] args) {
          Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the amount :");
	int amount = sc.nextInt();	
	double finalAmount  ;
	if(amount <=500) {
		finalAmount =  amount;
		System.out.println("no discount" + finalAmount);
	}else if(amount <= 1000) {
		finalAmount = amount - (amount - 0.10);
		System.out.println(" 10% discount" + finalAmount);
	} else if(amount<= 2000) {
		finalAmount = amount - (amount - 0.20);
		System.out.println("20% discount" + finalAmount);
		
		
	}else {
		finalAmount = amount - (amount - 0.30);
		System.out.println("30% discount" + finalAmount);
	}
	
	}



}
