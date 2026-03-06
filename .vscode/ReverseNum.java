
//input = 123456789
//output=987654321
//the given numbser is reverse
public class ReverseNum {
    public static void main(String[] args) {
        long num =123456789;
        long rev =0;
         while(num>0){
            long digit = num%10;
            rev = rev*10+digit;
            num = num/10;
         }
         System.out.println("reverse of number is:" + rev);
    }
    
}
