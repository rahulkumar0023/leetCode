package Jul.Jul31;

import java.util.*;

public class ArrayIntersectionII {

    public int[] intersect(int[] nums1, int[] nums2) {
        // Create frequency maps for both arrays
        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();

        for (int num : nums1) {
            count1.put(num, count1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            count2.put(num, count2.getOrDefault(num, 0) + 1);
        }

        // List to store the intersection
        List<Integer> intersection = new ArrayList<>();

        // Iterate over the elements in count1 map
        for (Map.Entry<Integer, Integer> entry : count1.entrySet()) {
            int num = entry.getKey();
            int freq1 = entry.getValue();

            if (count2.containsKey(num)) {
                int freq2 = count2.get(num);
                // Add the minimum of freq1 and freq2 to the result
                int minFreq = Math.min(freq1, freq2);
                for (int i = 0; i < minFreq; i++) {
                    intersection.add(num);
                }
            }
        }

        // Convert list to array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayIntersectionII solution = new ArrayIntersectionII();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2))); // Output: [2, 2]

//        // Example 2
//        int[] nums1 = {4, 9, 5};
//        int[] nums2 = {9, 4, 9, 8, 4};
//        System.out.println(Arrays.toString(solution.intersect(nums1, nums2))); // Output: [4, 9]
    }

}
