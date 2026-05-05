class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int validElementIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[validElementIndex] = nums[i];
                validElementIndex++;
            }
        }

        return validElementIndex;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 4};

        int k = s.removeDuplicates(nums);

        System.out.println("Unique count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}