package BitManipulation;
import java.util.Scanner;

public class CountOnesInNum {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++; ///Counts number of 1's in binary representation off n
            }
            n = n >> 1;
        }

        System.out.println("Number of 1's = " + count);
  }
}
