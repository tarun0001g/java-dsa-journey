
import java.util.Scanner;

public class ToggleBitPosition {
  public static void main(String[] args) {
    //Method 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        int result = n ^ bitMask;//we use XOR (^). ^ = flips only that bit
        
        System.out.println("After toggling bit = " + result);

    //Method 2  (My method)
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter number (n): ");
      // int n = sc.nextInt();//0101 (5)
      // System.out.print("Enter Position (pos): ");
      // int pos = sc.nextInt();// between 0-4, ex. 2
      // int bitMask = 1<<pos; // for 2, 0100 AND for 1 -> 0010

      // //Get bit value at the positon (pos)
      // if((n & bitMask)==0){ //Means Bit value is zero at position (pos)
      //   System.out.println("The Bit value at given positon was zero(0)."); 
      //   int newNumber = n | bitMask ;
      //   System.out.println("The new value is : "+newNumber);
      // }
      
      // else{
      //   System.out.println("The Bit value at given positon was one(1)."); 
      //   int newBitMask = ~(bitMask); //0100 -> 1011
      //   int newNumber = n & newBitMask; // 0101 * 1011 => 0001 (we removed one and add zero)
      //   System.out.println("The new value is : "+newNumber); // prints 1
      // }

  }
}
