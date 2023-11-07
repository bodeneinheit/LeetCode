class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int wiggleLength = 1;
        int prevDiff = nums[1] - nums[0];
        
        if (prevDiff != 0) {
            wiggleLength = 2;
        }

        for (int i = 2; i < nums.length; i++) {
            int currentDiff = nums[i] - nums[i - 1];

            if (currentDiff == 0) {
                continue;
            }

            if ((currentDiff > 0 && prevDiff <= 0) || (currentDiff < 0 && prevDiff >= 0)) {
                wiggleLength++;
                prevDiff = currentDiff;
            }
        }
        
        return wiggleLength;
    }
}