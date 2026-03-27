public class Velocoty {
    public static void main(String[] args) {
        int distance = 100;
        int time  = 10;
        int velocity = distance/time;
        if(distance ==0){
            System.out.println("motion is rest" + velocity);
        }else{
            System.out.println("motion is running: " + velocity);
        }
    }
    
}
