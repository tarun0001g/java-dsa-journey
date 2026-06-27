
import java.util.Scanner;

public class isArmstrong {
  public static void main(String[] args){
    boolean ans = checkArmstrong();
    if(ans){
      System.out.println("Armstrong Number");
    }
    else{
      System.out.println("Not an Armstrong Number!");
    }
  }

  public static boolean checkArmstrong() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int n = sc.nextInt();
     sc.close();

     if (n == 0) {
            return true;
        }
        int temp = n; 
        int originalNum = n;
        int count = 0;
        int sum = 0;
        //count digits
        while(temp != 0){
            count++;
            temp /= 10;
        }

        // check isArmstrong
        while(n !=0 ){
            int digit = n % 10; 
            sum = sum + (int) Math.pow(digit, count);
            n /= 10;
        }
        return sum==originalNum;
  }
}
