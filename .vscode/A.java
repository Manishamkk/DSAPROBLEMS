public class A{
    public static void main(String[] args) {
        int a =199;
        int b =200;
        int c  = 300;
        if(a>b && a>c){
            System.out.println("a is greate than b and c");
        }else if(b>c && b>a)
            {
                System.out.println("b is greate than a and c");
            }else{
                System.out.println("c is greate than a and b");
            }
    }
}