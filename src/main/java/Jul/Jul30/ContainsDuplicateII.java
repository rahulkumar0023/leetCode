package Jul.Jul30;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(nums[i])) {
                int previousIndex = numToIndex.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            numToIndex.put(nums[i], i); // Update the latest index of the number
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII solution = new ContainsDuplicateII();

        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Example 1: " + solution.containsNearbyDuplicate(nums1, k1)); // Output: true

        // Example 2
        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Example 2: " + solution.containsNearbyDuplicate(nums2, k2)); // Output: true

        // Example 3
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Example 3: " + solution.containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}
