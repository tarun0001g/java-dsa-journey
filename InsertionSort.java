public class InsertionSort {
  public static void main(String[] args) {
      //In this method we divide array into two parts: Sorted and Unsorted
      //We assume first element as a sorted element,
      //then we pick first element from unsorted array and put it in the right position in sorted array
      int arr[]= {5,4,7,2,1};
      for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        
        while(prev >= 0 && arr[prev]>curr){
            arr[prev + 1] = arr[prev];
            prev--;
          // if (arr[prev]>curr) {
          //     arr[prev + 1] = arr[prev];
          //     prev--;
          // }
          // else{break;}
        }       
        arr[prev + 1] = curr;
      }
      System.out.println("Sorted array is: ");
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
  }
}
