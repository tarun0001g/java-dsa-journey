
class BubbleSort{
  public static void main(String[] args) {
      int arr[] = {5,1,4,3,2};
      boolean isSwap = false;

      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length-i-1; j++){
          if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            isSwap = true;
          }
          if(!isSwap){
            return;
          }
        }
      }
      System.out.print("Array is sorted!\nThe sorted array is: ");
      for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+" ");
      }

  }
}