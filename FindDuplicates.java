import java.util.*;

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {

        // Method 1: HashMap
        /*
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                ans.add(entry.getKey());
            }
        }

        return ans;
        */

        // Method 2: HashSet
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                ans.add(nums[i]);
            }

            set.add(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2, 5, 1};

        List<Integer> duplicates = findDuplicates(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Duplicate elements: " + duplicates);
    }
}