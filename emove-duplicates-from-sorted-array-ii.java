class Solution {
    int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < 2 || nums[i] > nums[counter - 2]) {
                nums[counter] = nums[i];
                counter++;
            }   
        }
        return counter;
    }
}
