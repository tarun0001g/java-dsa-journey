import java.util.Scanner;

public class isPerfectNo {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int num = sc.nextInt();
     sc.close();

    boolean ans = isPerfect(num);

    if(ans){
      System.out.println("Perfect Number!");
    }
    else{
      System.out.println("Not a Perfect Number!");
    }
  }

  public static boolean isPerfect(int num) {
        //Method - 2:-
        if(num == 1){
            return false;
        }
        int sum= 1;
        for(int i=2; i*i<=num; i++){
            if(num % i ==0){
                int leftDivisor = i;
                int rightDivisor = num/i;
                sum += leftDivisor;
                if(leftDivisor != rightDivisor){
                    sum += rightDivisor;
                }
            }
        }
        
        return sum==num;

        //Method - 1:-
        // int sum =0;
        // for(int i=1; i<num; i++){
        //     if(num % i ==0){
        //         sum += i;
        //     }
        // }
        // return sum==num;
  }
}
