
public class FindPairForSumFromArray{

  public static void main(String[] args) {
      

    int arr[] = {2, 7, 11, 15};
    int sum = 9;

    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]+arr[j] == sum){
          System.out.println("Target found from index "+i+" & "+j);
        }
      }
    }

  }

}

//Pending optimize solution of FindPairForSumFromArray