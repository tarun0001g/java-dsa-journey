public class getLCM {
  public static void main(String args[]){
    int a = 12;
    int b = 18;

    int A = a;
    int B = b;
    
    //LCM(a,b) = (a*b)/gcd

    //Gcd(a,b) = gcd(b, a%b)
    //finding gcd(a,b)
    while(b != 0){
      int temp = b;
      b = a%b;
      a = temp;
    }
    int gcd = a;
    System.out.println("The GCD/HCF of a & b is: "+gcd);

    int lcm = (A*B)/gcd;
    System.out.println("The LCM of a & b is: "+lcm);
  }
}
