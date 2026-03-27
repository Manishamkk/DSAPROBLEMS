public class LeapYear {
    
    public static void main(String[] args) {
        int year = 2025;
        if(year%4==0  && year%100!=0 || year%400==0){
            System.out.println(year + " the is leap year");
        }else{
            System.out.println(year + " : this is not leap year");
        }
    }


}
