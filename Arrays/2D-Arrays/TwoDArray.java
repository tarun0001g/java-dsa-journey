


import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {
      // Scanner sc =  new Scanner(System.in);
      // System.out.println("Enter No of Rows and Columns :");
      // int rows = sc.nextInt();
      // int cols = sc.nextInt(); 
      // int numbers[][] = new int[rows][cols];

      // System.out.println("Enter Values of 2D array:- ");

      // //Input of Array
      // for(int i=0; i<rows; i++){
      //   for (int j=0; j<cols; j++){
      //     numbers[i][j] = sc.nextInt();
      //   }
      // }

      // //Printing the array
      // System.out.println("Your 2D Array is :-");
      // for(int i=0; i<rows; i++){
      //   for (int j=0; j<cols; j++){
      //     System.out.print(numbers[i][j] + " ");
      //   }
      //   System.out.println();//for next line
      // }
//------------------------------------------------------------------------------------------------------------------------------------------
      //Find an Element from 2D Array
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter No of Rows and Columns :");
      int rows = sc.nextInt();
      int cols = sc.nextInt(); 
      int numbers[][] = new int[rows][cols];

      System.out.println("Enter Values of 2D array:- ");

      //Input of Array
      for(int i=0; i<rows; i++){
        for (int j=0; j<cols; j++){
          numbers[i][j] = sc.nextInt();
        }
      }

      System.out.print("Enter the target element to search:");
      int x = sc.nextInt();
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
          if(numbers[i][j]==x){
            System.out.println("The number found at index: (" + i + ","+j+")");
          }
        }
      }

  }
}
