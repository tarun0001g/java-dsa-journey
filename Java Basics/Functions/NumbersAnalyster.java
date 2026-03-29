import java.util.*;
 
public class NumbersAnalyster{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int positiveCounter = 0;
    int negativeCounter = 0;
    int zeroCounter = 0;
    String ans;
    
   do {
          System.out.print("Enter the number: ");
          float num = sc.nextFloat();
          
          if(num>0){
            positiveCounter++;
          }
          else if(num<0){
            negativeCounter++;
          }
          else if(num==0){
            zeroCounter++;
          }
          System.out.print("Enter 'y' to continue or 'n' to stop: ");
          ans = sc.next();

      } while (ans.equals("y"));
    
    if(ans.equals("n")){
      System.out.println("U entered :");
      System.out.println(positiveCounter+" Positive Numbers");
      System.out.println(negativeCounter+" Negative Numbers");
      System.out.println(zeroCounter+" Zeros");
    }else{
      System.out.println("Enter a valid ans! (y/n)");
    }

  }

}

// do{

//     }while(ans=='y');
