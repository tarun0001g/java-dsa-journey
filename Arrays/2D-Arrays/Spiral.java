

public class Spiral {
  public static void main(String[] args) {
    //INPUT OF 2D Array
      // System.out.print("Enter size of an array (rows, cols): ");
      // Scanner sc = new Scanner(System.in);
      // int rows = sc.nextInt();
      // int cols = sc.nextInt();
      // int arr[][] = new int[rows][cols];

      // System.out.println("Enter elements in an array :");
      // for(int i=0; i<rows ; i++){
      //   for(int j=0; j<cols; j++){
      //     arr[i][j] = sc.nextInt();
      //   }
      // }

      // System.out.println("Your array is :");
      // for(int i=0; i<rows ; i++){
      //   for(int j=0; j<cols; j++){
      //     System.out.print(arr[i][j] + " ");
      //   }
      //   System.out.println();
      // }

//--------VERY IMPORTANT PROBLEM AND ITS LOGIC------------------------
      // int m=rows, n=cols;
      // int srow=0, erow=m-1, scol= 0, ecol = n-1;

      int arr [][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
      };
        int srow = 0;
        int erow = arr.length - 1;
        int scol = 0;
        int ecol = arr[0].length - 1;

      System.out.println("The spiral of this array is :");

      while(srow<=erow && scol<=ecol){
        //TOP row
        for(int i=scol; i<=ecol; i++){
          System.out.print(arr[srow][i]+ " ");
        }

        //Right col
        for(int j=srow+1; j<=erow; j++){
          System.out.print(arr[j][ecol]+ " ");
        }

        //Bottom row
        for(int i=ecol-1; i>=scol; i--){
          if(srow==erow){
            break;
          }
          System.out.print(arr[erow][i]+ " ");
        }

        //Left col
        for(int j=erow-1; j>=srow+1; j--){
          if(scol==erow){
            break;
          }
          System.out.print(arr[j][scol]+ " ");
        }
        srow++; erow--; scol++; ecol--;
      }

  }
}
