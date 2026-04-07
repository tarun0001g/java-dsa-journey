import java.util.Scanner;

public class PrintNames {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of an array: ");
      int size = sc.nextInt();
      String names[] = new String[size];

      System.out.println("Enter Names in the array: ");

      for(int i=0; i<size; i++){
        names[i] = sc.next();
      }

      System.out.println("The Names in the array are: ");
      for(int i=0; i<names.length; i++){
        System.out.println("name " + (i+1) +" is : " + names[i]);
      }
  }
}
