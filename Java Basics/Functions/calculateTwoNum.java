import java.util.*;

public class calculateTwoNum {

  public static int addTwoNumbers(int a, int b){
    return a+b;
  }
    public static int mulTwoNumbers(int a, int b){
    return a*b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The sum is : "+ addTwoNumbers(a,b));
    System.out.println("The Multiplication is : "+ mulTwoNumbers(a,b));
  }
}
