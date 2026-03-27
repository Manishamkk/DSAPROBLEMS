public class NumDivisible { 
    public static void main(String[] args) {
        int num1 =  15;
        int num2 =  50;
        int num3 = 80;

        if(num1%2==0){
            System.out.println(num1 + "is divisible by 2");
        }else if(num2%3==0){
            System.out.println(num2 + " divisible by 3");

        }else if(num3%15==0){
            System.out.println(num3 + "dividible by 15");;
        }else{
            System.out.println("not any number is divisible by this 3numbers");
        }
    }
    
}
