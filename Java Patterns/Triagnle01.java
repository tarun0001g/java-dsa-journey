public class Triagnle01 {
  public static void main(String[] args) {
    int n=5;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
          //Using logic, when index (i,j) sum is even then we put "1", otherwise "0"
          if((i+j)%2==0){
            System.out.print(" 1 ");
          }else{
            System.out.print(" 0 ");
          }
        }
        System.out.println();
      }
  }
}
