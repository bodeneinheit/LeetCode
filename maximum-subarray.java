class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i: nums) {
            currentSum = Math.max(i, currentSum + i);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }
}
