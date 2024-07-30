package Jul.Jul30;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2)); // Output: 2

        // Example 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums3)); // Output: 8
    }
}
