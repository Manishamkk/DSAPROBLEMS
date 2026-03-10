public class RemoveDupli {
    public static void main(String[] args) {
        
        String str = "manisha keshav kadam";
        String result = " " ;
        for(int i = 0;i<str.length();i++){
            char ch  = str.charAt(i);
            if(result.indexOf(ch)<0){
                result = result +ch;
            }
        }
        System.out.println("remove th duplicates" + result);
    }
    
}
