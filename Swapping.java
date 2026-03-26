public class Swapping{
    public static void main(String[] args) {
        int a =100;
        int b =200;
       // int temp;
         System.out.println("before swapping a and b" + a  + "or" + b);
        // temp = a;
        // a = b;
        // b = temp;
        a = a+b; //100+ 200 =300
        b = a-b ; //300=200 =100
        a  = a-b; //300-100 =200
        System.out.println("after swapping a and b" + a  + "or" + b);
    }
}