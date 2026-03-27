public class Distance {
    //calculate the distance and work done  be the force and distance
    public static void main(String[] args) {
        int force = 30;
        int distance = 89;
        int work  = force * distance;
        if(distance == 0){
            System.out.println("not any work is done :" + work);
        }else{
            System.out.println("work is fdone :" + work);
        }
    }
    
}
