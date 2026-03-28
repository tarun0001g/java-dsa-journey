

public class solidRhombus {
 public static void main(String[] args) {
  int n=5;
  //Outer loop(nextline)
     for(int i=1; i<=n; i++){
      //For Spaces
      for(int j=1; j<=n-i; j++){
        System.out.print("   ");
      }
      //For starts
      for(int j=1; j<=n; j++){
        System.out.print(" * ");
      }
      System.out.println("");
     }
 } 
}
