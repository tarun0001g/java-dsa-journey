
import java.util.Scanner;

public class FindPower {

  public static int pow(int x, int y){
    int result=1;
    for(int i=1; i<=y; i++){
      result = result * x;
    }
    return  result;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter values (x,y):");
      int x = sc.nextInt();
      int y = sc.nextInt();
      int ans = pow(x,y);
      System.out.println("The power of (x,y) is: " + ans);

  }
}
