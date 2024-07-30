package Jul.Jul30;

//Key Properties of the Algorithm
//Time Complexity: O(n), as we only traverse the array once.
//Space Complexity: O(1), as only a few extra variables are used.
//The Boyer-Moore Voting Algorithm is an efficient and elegant solution to find the majority element, especially given the constraints that the majority element always exists in the array. This method ensures that we achieve the solution in the most optimal time and space complexities.
//
//


public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

//        // Example 1
//        int[] nums1 = {3, 2, 3};
//        System.out.println("Example 1: " + solution.majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {5, 5, 3, 3, 3, 5, 5};
        System.out.println("Example 2: " + solution.majorityElement(nums2)); // Output: 2
    }
}
