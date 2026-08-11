
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
      int target = 9;

    HashMap<Integer,Integer> freq = new HashMap<>();

    for(int i=0; i<nums.length; i++){
      //formula
      int needed = target - nums[i];
      if(freq.containsKey(needed)){
        System.out.println(freq.get(needed)+ " "+ i);
        break;
      }
      freq.put(nums[i], i);
    }

  }
}
