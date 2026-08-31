public class SumOfArrayExcludingCurrIdx {
  public static void main(String args[]){

    int nums[] = {1,2,3,4};
    int sumArr[] = new int[nums.length];

    for(int i=0; i<nums.length; i++){
      int sum = 0;
      for(int j=0; j<nums.length; j++){
        if(i==j){
          continue;
        }
        else{
          sum  = sum + nums[j];
        }
      }
      sumArr[i] = sum;
    }

    for(int i=0; i<sumArr.length; i++){
      System.out.print(sumArr[i]+" ");
    }

  }
}
