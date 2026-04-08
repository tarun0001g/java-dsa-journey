import java.util.Scanner;

public class GetUsername {
  public static void main(String[] args) {

    // METHOD-2 (BEST)
      System.out.print("Enter your email : ");
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();
      StringBuilder sb = new StringBuilder(email);

      int fromIndex = sb.indexOf("@"); //Get index of '@'

      sb.delete(fromIndex, sb.length()); // Delete string from '@' to end.

      // String username = sb; //wrong way
      String username = sb.toString(); //just copy
      // StringBuilder username = new StringBuilder(sb);  //editable copy of username string

      //System.out.println("Your Username is: "+ sb); // Direct use
      System.out.println("Your Username is: "+ username);


    //------------------------- METHOD-1---------------------------------------------
      // System.out.print("Enter your email : ");
      // Scanner sc = new Scanner(System.in);
      // String email = sc.nextLine();
      // StringBuilder sb = new StringBuilder();
      // for(int i=0; i<email.length(); i++){
      //   char ch = email.charAt(i);
      //   if(ch =='@'){
      //     break;
      //   }
      //   else{
      //     sb.append(ch);
      //   }
      // }
      // System.out.println("Your Username is: "+ username);
  }
}
