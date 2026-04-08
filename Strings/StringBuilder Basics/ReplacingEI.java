
import java.util.*;

public class ReplacingEI {
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the string : ");
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch =='e'){
          sb.append('i');
        }
        else{
          sb.append(ch);
        }
      }
      System.out.println("The new string is: "+ sb);

      //------------------We can directly get input in the stringBuilder---------------------------------------------------------------
      // Scanner sc = new Scanner(System.in);
      // StringBuilder sb = new StringBuilder();
      // sb.append(sc.nextLine());
      // System.out.println("name is : "+sb);

      //------MOST COMMON IN INTERRVIEWS---------------------------------
      // String input = sc.nextLine();
      // StringBuilder sb = new StringBuilder(input); //No need of loop to append
  }
}
