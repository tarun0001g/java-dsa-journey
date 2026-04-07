package Arrays.Basics;
import java.util.Scanner;

public class MinMax {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of an array: ");
      int size = sc.nextInt();
      int arr[] = new int[size];

      System.out.println("Enter numbers in an array: ");
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }

      // int Min = arr[0];
      // int Max = arr[0];
      
      //It helps when scanning an array without assuming the first element.
      int Min = Integer.MAX_VALUE; //Max stays 2147483647
      int Max = Integer.MIN_VALUE; //Min stays -2147483648
      //So array values can replace them.

      for(int i=0; i<size; i++){
        if(arr[i] < Min){
          Min = arr[i];
        }
        if(arr[i] > Max){
          Max = arr[i];
        }
      }

      System.out.println("The Maximum Number is: " + Max);
      System.out.println("The Minimun Number is: " + Min);
  }
}
