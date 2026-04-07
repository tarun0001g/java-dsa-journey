import java.util.Scanner;

public class FindTotalLength {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of an array: ");
      int size = sc.nextInt();
      String names[] = new String[size];
      int totalLenght = 0;

      System.out.println("Enter Strings in the array: ");
      for(int i=0; i<size; i++){
        names[i] = sc.nextLine();
        totalLenght += names[i].length();
      }
      System.out.println("Total Length is : "+totalLenght);
  }
}
