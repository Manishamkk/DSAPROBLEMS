
public abstract class SpecialNum {

	
	public static  int factorial(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact *i;
			
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		int num = 145;
		int rem  ;
		int sum =0;
		int temp = num;
		while(num>0) {
			rem = num%10;
			sum = sum +factorial(rem);
			num = num/10;
		}
		if(temp ==sum) {
			System.out.println("special num");
		}else {
			System.out.println("not special num");
		}
	}
}
