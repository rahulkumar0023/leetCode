package Jul.Jul30;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
        public List<String> summaryRanges(int[] nums) {
            List<String> ranges = new ArrayList<>();
            if (nums.length == 0) return ranges;

            int start = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1] + 1) {
                    // End of a range
                    if (start == nums[i - 1]) {
                        ranges.add(String.valueOf(start));
                    } else {
                        ranges.add(start + "->" + nums[i - 1]);
                    }
                    // Start a new range
                    start = nums[i];
                }
            }

            // Add the last range
            if (start == nums[nums.length - 1]) {
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "->" + nums[nums.length - 1]);
            }

            return ranges;
        }

        public static void main(String[] args) {
            SummaryRanges solution = new SummaryRanges();

            // Example 1
            int[] nums1 = {0, 1, 2, 4, 5, 7};
            System.out.println("Example 1: " + solution.summaryRanges(nums1)); // Output: ["0->2","4->5","7"]

            // Example 2
            int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
            System.out.println("Example 2: " + solution.summaryRanges(nums2)); // Output: ["0","2->4","6","8->9"]
        }
    }