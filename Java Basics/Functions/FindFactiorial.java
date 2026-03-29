
import java.util.Scanner;

public class FindFactiorial {

  public static void generateFactorial(int n){
    int fact = 1;
    if(n<0){
      System.out.println("Invalid Number!");
      return;
    }
    if(n==0){
      System.out.println("The factorial is : "+ fact);
      return;
    }
    for(int i=n; i>=1; i--){
      fact = fact*i;
    }
    System.out.println("The factorial is : "+ fact);
  }
  public static void main(String[] args) {
    System.out.println("Enter the number: ");
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      generateFactorial(n);
  }
}
