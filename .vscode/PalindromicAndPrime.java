public class PalindromicAndPrime {
    public static void main(String[] args) {
		for(int j = 100;j<1000;j++) {
		int num = j;
		int rem;
		int rev = 0;
		int temp = num;
		
		while(num>0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		if(temp==rev) {
			System.out.println("palindromic num : " +rev);
		}else {
			System.out.println("not palindromic number :" +rev);
		}
		
		
		int count  =0;
		for(int i =1;i<temp;i++) {
			if(temp%i==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println("prime number  : " + rev);
		}else {
			System.out.println("not prime  : " +rev);
		}
		
		
		
	}}
}
