public class SecondLargest {
     public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,67,654,52};
        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest=arr[i];
            } else if(arr[i]> secondLargest && arr[i] != firstLargest){
                secondLargest=arr[i];
            }
                firstLargest = arr[i];
            }
            System.out.println("second largest  number is : " + secondLargest);
        }
     }
    

