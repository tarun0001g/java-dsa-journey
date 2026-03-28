public class DimondPattern {
  public static void main(String[] args) {
    //First Half of Dimond
    int n=3;  
    for(int i=0; i<=n; i++){
      //To Print Spaces
      for(int j=1; j<=n-i; j++){
        System.out.print("   ");
      }
      //To Print Stars(Upper Half)
      for(int j=1; j<=1+2*i ; j++){
        System.out.print(" * ");
      }
      System.out.println();
    }
    //Second Half of Dimond
    for(int i=n; i>=0; i--){
      //To Print Spaces 
      for(int j=1; j<=n-i; j++){
        System.out.print("   ");
      }
      //To Print Stars(Lower Half)
      for(int j=1+2*i; j>=1; j-- ){
        System.out.print(" * ");
      }
      System.out.println();
    }

  }
}
