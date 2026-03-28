public class NumberPyramid {
  public static void main(String [] args){
    int n=5;
    //Outer Loop
    for(int i=1; i<=n ; i++){
      //Prints Spaces
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      //Print Numbers
      for(int j=1; j<=i; j++){
        System.out.print(i+"  ");
      }
      System.out.println();
    }
  }
}
