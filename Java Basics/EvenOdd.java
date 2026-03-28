
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //optimized code for odd numbers
        System.out.println(" ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

    }
}
