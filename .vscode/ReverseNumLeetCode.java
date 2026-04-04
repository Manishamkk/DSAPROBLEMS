public class ReverseNumLeetCode {

public static int reverse(int x){
int rev =0;
while(x!=0){
    int rem = x%10;
    x = x/10;
if(rev>Integer.MAX_VALUE/10 ||rev<Integer.MIN_VALUE/10){
    return 0;
}

    rev = rev*10+rem;
}
 return rev;   
}

    public static void main(String[] args) {
        int num1 = 123;
        int num2 =-123;
        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
    }
}
