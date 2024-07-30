package Jul.Jul30;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int uniqueNumber = 0;

        // XOR all the numbers in the array
        for (int num : nums) {
            uniqueNumber ^= num;
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        // Example 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Example 1: " + solution.singleNumber(nums1)); // Output: 1

        // Example 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Example 2: " + solution.singleNumber(nums2)); // Output: 4

        // Example 3
        int[] nums3 = {1};
        System.out.println("Example 3: " + solution.singleNumber(nums3)); // Output: 1
    }
}
