import java.util.Scanner;

public  class printNprimes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int n = sc.nextInt();
     sc.close();
     
      for(int i=2; i<=n; i++){
        boolean isItPrime = isPrime(i);
        if(isItPrime){
          System.out.println(i);
        }
      }
  }

  public static  boolean isPrime(int n){
    for(int i=2; i*i<=n; i++){
      if(n % i == 0){
        return false;
      }
    }
        return true;
  }
}
