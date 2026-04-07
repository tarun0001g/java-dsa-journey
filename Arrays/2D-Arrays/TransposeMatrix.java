import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String[] args) {
    //Input of array
      System.out.print("Enter size of an array (rows, cols): ");
      Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int cols = sc.nextInt();
      int matrix[][] = new int[rows][cols];

      System.out.println("Enter elements in an array :");
      for(int i=0; i<rows ; i++){
        for(int j=0; j<cols; j++){
          matrix[i][j] = sc.nextInt();
        }
      }

      System.out.println("Your Matrix is :");
      for(int i=0; i<rows ; i++){
        for(int j=0; j<cols; j++){
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
      //Creating transpose of matrix
      int transpose[][] = new int[cols][rows];
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
          transpose[j][i] = matrix[i][j]; //Key Point
        }
      }
      System.out.println("The transpose is: ");
      for(int i=0; i<rows ; i++){
        for(int j=0; j<cols; j++){
          System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
      }
  }
}
