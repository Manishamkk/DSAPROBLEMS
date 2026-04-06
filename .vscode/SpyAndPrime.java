public class SpyAndPrime {

    public static void main(String[] args) {

        int num = 1124;
        int temp = num;

        int rem;
        int sum = 0;
        int product = 1;

        // Spy number logic
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println("This is a Spy Number");
        } else {
            System.out.println("This is Not a Spy Number");
        }

        // Prime number logic
        int count = 0;

        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}