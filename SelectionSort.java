public class SelectionSort {
  public static void main(String[] args) {
      //In This method we looks for smallet element from an array, it is opposite of buttble sort
      //In this method we divide our array into two parts:- Sorted & Unsorted 
      // we swap smallest element with first unsorted element
      int arr[] = {5,1,4,3,2};

      for(int i=0; i<arr.length-1;i++){
        int smallestIdx = i;
        for(int j=i+1; j<arr.length; j++){
          if(arr[j] < arr[smallestIdx]){
            smallestIdx = j;
          }
        }
        int temp = arr[i];
        arr[i] = arr[smallestIdx];
        arr[smallestIdx]= temp;
      }

      //Printing the sorted array
      System.out.print("Array is sorted!\nThe sorted array is: ");
      for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+" ");
      }

  }
}
