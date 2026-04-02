

public class PatersonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num   = 145;
		int rem ;
		int sum =0;
		int temp = num;
		while(num >0) {
			rem = num %10;
			int fact = 1;
			for(int i= 1;i<=rem;i++) {
				fact = fact*i;
			}
			sum =sum+fact;
			num = num/10;
		}
		if(temp ==sum) {
			System.out.println("paterson num");
		}else {
			System.out.println(" not paterson num"); 
		}

	}

}
