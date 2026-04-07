public class SpetialNum {
    public static void main(String[] args) {
		for(int j = 100;j<=500;j++) {
		int num =j;
		int sum = 0;
		int temp =num;
		while(num>0) {
			int rem  = num%10;
			int fact  =1;
			for(int i =1;i<rem;i++) {
				fact  =fact*i;
			}
			sum  = sum+fact;
			num =num/10;
		}
		if(temp==sum) {
			System.out.println("spetial num" + sum);
		}else {
			System.out.println("not spetial num" + sum);
		}
	}
	}
}
