package Jul.Jul28;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // pointer for nums1
        int p2 = n - 1; // pointer for nums2
        int p = m + n - 1; // pointer for merged array

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println("Output: " + java.util.Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

        // Example 2
        int[] nums1_2 = {1};
        int m_2 = 1;
        int[] nums2_2 = {};
        int n_2 = 0;
        solution.merge(nums1_2, m_2, nums2_2, n_2);
        System.out.println("Output: " + java.util.Arrays.toString(nums1_2)); // Output: [1]

        // Example 3
        int[] nums1_3 = {0};
        int m_3 = 0;
        int[] nums2_3 = {1};
        int n_3 = 1;
        solution.merge(nums1_3, m_3, nums2_3, n_3);
        System.out.println("Output: " + java.util.Arrays.toString(nums1_3)); // Output: [1]
    }

}

