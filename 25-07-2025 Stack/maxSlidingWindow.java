// leetcode 239. Sliding Window Maximum
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++){
            wSum += nums[i];
        }

        for(int i = k;i<nums.length;i++){
            wSum = wSum - nums[i-k] + nums[i];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;  
    }
}
