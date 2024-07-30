package Jul.Jul30;

public class RangeSumQueryImmutable {

    private int[] prefixSum;

    public RangeSumQueryImmutable(int[] nums) {
        // Initialize the prefixSum array with size nums.length + 1
        prefixSum = new int[nums.length + 1];
        // Build the prefix sum array
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        // Return the sum of elements between indices left and right
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3
    }
}
