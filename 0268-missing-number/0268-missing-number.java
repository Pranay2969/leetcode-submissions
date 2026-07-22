class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int miss = 0;
        for(int i = 1; i <= n; i++) {
            miss = (miss ^ i) ^ nums[i - 1];
        }

        return miss;
    }
}