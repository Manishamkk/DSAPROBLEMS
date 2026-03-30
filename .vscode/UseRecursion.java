

public class UseRecursion {
    public static void printEven(int n){
        if(n>10){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
     printEven(n+1);
    }
    public static void main(String[] args) {
        printEven(1);
    }
}
