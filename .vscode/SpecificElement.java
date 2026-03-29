public class SpecificElement {
    public static void main(String[] args) {
        int[] arr = {20,30,40,36,67,89,56};
        int specific=89;
        boolean  found =  false;
        for(int i = 0;i<=arr.length;i++){
            if(arr[i] == specific){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in the array.");
        }else{
            System.out.println("Element not found in the array.");
        }
        if(found){
            System.out.println("Element is found:" + specific);
        }else{
             System.out.println("Element is not  found:" + specific);
        }
    }
    
}
