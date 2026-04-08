
import java.util.Scanner;


public class StringBuilderDemo {
  public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Alex");
      System.out.println(sb);

      //.charAt Property
      System.out.println(sb.charAt(2));

      //Set char at index x
      sb.setCharAt(0, 'D');
      sb.setCharAt(2, 'u');
      System.out.println(sb); //Dlux

      //Add char at index x
      sb.insert(1, 'e');//Delux
      System.out.println(sb);

      //Delete char at index or between index
      sb.delete(1, 2);
      System.out.println(sb);

      //Append char
      sb.append(" ");
      sb.append("P");
      sb.append("A");
      sb.append("N");
      System.out.println(sb);

      //length of String
      System.out.println(sb.length());

      //NOTE: sb.length() → It tells total number of characters inside StringBuilder.
      // arr.length → It tells how many elements the array can store.

      //We can directly get input in the stringBuilder
      Scanner sc = new Scanner(System.in);
      sb.append(sc.nextLine());

      //------MOST COMMON IN INTERRVIEWS---------------------------------
      // String input = sc.nextLine();
      // StringBuilder sb = new StringBuilder(input); //No need of loop to append

      //----FIND THE INDEX OF CHARACTER:-> sb.indexOf() -----------
      // int fromIndex = sb.indexOf("@");
  }
}
      
