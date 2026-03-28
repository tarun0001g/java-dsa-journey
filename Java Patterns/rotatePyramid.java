public class rotatePyramid {
  public static void main(String[] args) {
    int n=4;
    for(int i=1; i<=n; i++){
      //Loop to add space
      for(int j=1; j<=n-i; j++){
        System.out.print("   ");
      }
      //Loop to add *
      for(int j=1; j<=i; j++){
        System.out.print(" * ");
      }
      System.out.println("");
    }
  }
}
