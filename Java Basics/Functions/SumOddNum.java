
import java.util.*;
public class SumOddNum {
  public static int sumOfOddNumbers(int n){
    int sum=0;
    for(int i=1; i<=n; i++){
      if(i%2!=0){
        sum = sum+i;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number: ");
      int n = sc.nextInt();
      int sum = sumOfOddNumbers(n);
      System.out.println("The sum of odd numbers (till n) is: "+ sum);
      
  }

}

// do{
//         System.out.println("Tarun");
//       }while(true);
