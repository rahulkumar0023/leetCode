package Jul.Jul30;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        // Fill the rest of the array with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        // Example 2
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
}
