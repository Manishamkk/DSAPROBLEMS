public class PrimeArmstrong {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int j = 100;j<=1000;j++) {
		int num = j;
		int rem ;
		int sum = 0;
		int temp =num;
		while(num>0) {
			rem  =num%10;
			sum  = sum+(rem*rem*rem);
			num = num/10;
		}
		if(temp==sum) {
			System.out.println("armstrong num: " + sum);
		}
		
		int count =0;
				for(int i =100;i<=temp;i++) {
					if(temp%i==0) {
						count++;
					}
				}
		if(count==2) {
			System.out.println("prime num : " + sum);
		}
	}
	}
}
