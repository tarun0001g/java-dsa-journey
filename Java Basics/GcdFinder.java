
import java.util.Scanner;

 class GcdFinder {
  public static void main(String args[]){
    System.out.println("Enter numbers one by one: ");
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int GCD = 1;

    for(int i=1; i<=num1 && i<=num2; i++ ){
      if(num1%i==0 && num2%i==0){
        GCD = i;
      }
    }

    System.out.println("The GCD of above numbers is : "+GCD);

  }
}