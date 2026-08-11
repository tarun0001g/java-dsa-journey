import java.util.*;

public class findFreqIsOne {
  public static void main(String[] args) {
      int[] nums = {4, 1, 2, 1, 2};
      HashMap<Integer, Integer> freq = new HashMap<>();

      //Added array elements in Map
      for(Integer x: nums){
        freq.put(x, freq.getOrDefault(x, 0)+1);
      }

      //Checking the freq
      for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
        if(entry.getValue()==1){
          System.out.println(entry.getKey());
        }
      }

  }
}
