
public class MergeTwoSortedArray {
  public static void main(String[] args) {
      

    int arr1[] = {1,2,3,4,5};
    int arr2[] = {4,5,6,7,8};

    //Approach-2
     int i = 0;
    int j = 0;

    while (i < arr1.length && j < arr2.length) {

      if (arr1[i] < arr2[j]) {
          System.out.print(arr1[i] + " ");
          i++;
      }
      else if (arr2[j] < arr1[i]) {
          System.out.print(arr2[j] + " ");
          j++;
      }
      else {
          // Both are equal → print only once
          System.out.print(arr1[i] + " ");
          i++;
          j++;
      }
    }
    // Remaining elements of arr1
    while (i < arr1.length) {
        System.out.print(arr1[i] + " ");
        i++;
    }

    // Remaining elements of arr2
    while (j < arr2.length) {
        System.out.print(arr2[j] + " ");
        j++;
    }

    //Approach-1
    // List<Integer> list = new ArrayList<>();

    // for(int i=0; i<arr1.length; i++){
    //   if(list.contains(arr1[i])){
    //     continue;
    //   }
    //   list.add(arr1[i]);
    // }

    // for(int i=0; i<arr2.length; i++){
    //   if(list.contains(arr2[i])){
    //     continue;
    //   }
    //   list.add(arr2[i]);
    // }

    // System.out.println(list);

  }
}
