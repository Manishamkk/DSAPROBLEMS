public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,3,2,8,6};  
    for(int i = 0;i<=arr.length;i++){
        boolean isDuplicate = false;
        for(int j = i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(" Duplicate numbers"+arr[i]);
                isDuplicate =true;
                break;
            }
        }
        if(! isDuplicate){
System.out.println("unique number is:"+arr[i]);
    }
    }
    
    
    
    }
    
}
