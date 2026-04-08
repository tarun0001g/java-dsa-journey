import java.util.Scanner;

public class FindTotallLength {
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter size of string array: ");
      int size = sc.nextInt();
      sc.nextLine();

      String arr[] = new String[size];
      System.out.print("Enter names in the array: ");
      for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextLine();
      }

      StringBuilder sb = new StringBuilder();
      for(int i=0; i<arr.length; i++){
        sb.append(arr[i]);
      }

      int totalLength = sb.length();
      System.out.println("Combined String: " + sb);
      System.out.println("Combined String Length: " + totalLength);
      
       //NOTE: sb.length() → It tells total number of characters inside StringBuilder.
      // arr.length → It tells how many elements the array can store.
  }
}
