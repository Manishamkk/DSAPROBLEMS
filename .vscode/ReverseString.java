public class ReverseString{
    public static void main(String[] args) {
        String str1 = "manisha";
        String str2 = "kadam";
        String result = str1 + " " +str2;
        System.out.println(result);
        String rev = " ";
        int len = str1.length();
        System.out.println(len);
        for(int i = str1.length()-1;i>=0;i--){
            rev = rev + str1.charAt(i);
        }
       System.out.println(rev); 
       System.out.println("upper case:" + rev.toUpperCase());
       System.out.println("lower case:" + rev.toLowerCase());
    }
}