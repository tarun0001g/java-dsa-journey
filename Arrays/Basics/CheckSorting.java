import java.util.*;

public class CheckSorting {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of an array: ");
      int size = sc.nextInt();
      int arr[] = new int[size];

      System.out.println("Enter numbers in an array: ");
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Length "+arr.length);

      boolean isAscending = true;
      for(int i=0; i<arr.length-1; i++){ //ex.1,2,3,4-> run only i=0 to i=2 (<length=4-1=3( i++ till less than 3))
        if(arr[i] > arr[i+1]){
          isAscending = false;
        }
      }
      if(isAscending==true){
        System.out.println("Array is sorted!");
      }else
       System.out.println("Array is not sorted!");
    }
}
