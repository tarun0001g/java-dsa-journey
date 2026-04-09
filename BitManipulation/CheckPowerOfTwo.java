package BitManipulation;

import java.util.Scanner;

public class CheckPowerOfTwo {
  public static void main(String[] args) {
      //Problem:- Write a program to find/check if a number is a power of 2 or not
      //means: User gives one number, Your program checks that number belongs to this pattern or not : 1, 2, 4, 8, 16, 32, 64, ...

      //Best Solution with Time Complexity O(1):- 

      Scanner sc = new  Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      if(num<=0){
        System.out.println("Please Enter valid number (Number>0)!");
        return;
      }
      if((num & (num - 1)) == 0){ //formula to find :- ex.8 -> 1000(8) & 0111(7) == 0000 
        System.out.println("The number is power of 2");
      }
      else{
        System.out.println("The number is not power of 2");
      }



      //Another way to solve this problem: O(log n)

      // Scanner sc = new  Scanner(System.in);
      // System.out.print("Enter number: ");
      // int num = sc.nextInt();
      // if(num<=0){
      //   System.out.println("Please Enter valid number (Number>0)!");
      //   return;
      // }

      // while (num%2 == 0) { 
      //     num = num/2;
      // }
      // if(num == 1){
      //   System.out.println("The number is power of 2");
      // }
      // else{
      //   System.out.println("The number is not power of 2");
      // }


  }
}
