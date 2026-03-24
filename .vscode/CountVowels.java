public class CountVowels {
    public static void main(String[] args) {
        String str = "manisha keshav kadam";
        int count  = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            count = (ch=='a' || ch=='e' | ch == 'i' | ch == 'o' | ch== 'u' ? count + 1 :count);
        }
        System.out.println("total vowels are : " + count);
    }
    
}
