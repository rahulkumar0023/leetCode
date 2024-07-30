package Jul.Jul30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Convert both arrays to sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        // Find the intersection of the two sets
        set1.retainAll(set2);

        // Convert the result set to an array
        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfArrays solution = new IntersectionOfArrays();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersection(nums1, nums2))); // Output: [2]

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersection(nums3, nums4))); // Output: [4, 9]
    }
}
