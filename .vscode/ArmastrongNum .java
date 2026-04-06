public class ArmastrongNum {
	
	public static void main (String[] args) {
		for(int i =100;i<=1000;i++) {
	int num = i;
	int rem ;
	int sum = 0;
	int temp = num;
	
	while(num>0) {
		rem  = num%10;
		sum = sum+(rem*rem*rem);
		num =num/10;
	}
	if(sum==temp) {
		System.out.println("armstrong number:" + sum);
	}else {
		System.out.println("not armstrong num :" + sum);
	}

}
}}