import java.util.Scanner;

public class ReplaceLetter {
  public static void main(String[] args) {
    //Second method:
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string: " );
      String str = sc.next();
      String result = "";

      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i); //char can store only single character not a string
        if(ch == 'e'){
          result += 'i';
        }
        else{
          result += ch;
        }
      }
      System.out.println("New string is: " + result);      

      //Notice: char uses single quotes ' ' &  String uses double quotes " "
      // char stores values as a symbol like, 'a'  '7'  '@'  ' '



    //First Method to Replace Letter
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter the string: " );
      // String str = sc.next();
      // String result = "";

      // for(int i=0; i<str.length(); i++){

      //   if(str.charAt(i) == 'e'){
      //     result += 'i'; //If matches, then add "i" in the result string. insetad of "e"
      //   }
      //   else{
      //     result += str.charAt(i);
      //   }
      // }

      // System.out.println("New string is: " + result);

  }
}
