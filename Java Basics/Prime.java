
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }

        // for (int i = 2; i < num; i++) {
        //     if (num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        for (int i = 2; i < Math.sqrt(num); i++) { //Optimized code with O(sqrt(n)) complexity
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("The given number is Prime Number!");
        } else {
            System.out.println("The given number is not Prime Number!");
        }

    }
}
