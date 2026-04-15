

public class InvertedRight {
public static void main(String[] args) {
	
	
	
	        int n = 5;

	        for(int i = 1; i <= n; i++) {

	            // spaces increase
	            for(int j = 1; j < i; j++) {
	                System.out.print("  ");
	            }

	            // stars decrease
	            for(int j = i; j <= n; j++) {
	            	System.out.print(  j+ " ");
	            }

	            System.out.println();
	        }
	    }
	}

