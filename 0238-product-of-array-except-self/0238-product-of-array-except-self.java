class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 0);
        int zeroCount = 0;
        int allProduct = 1;
        int zeroPlace = -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                allProduct *= nums[i];
            } else {
                zeroCount++;
                if(zeroCount > 1) return result;
                zeroPlace = i;
            }
        }
        if(zeroCount != 0) {
            result[zeroPlace] = allProduct;
            return result;
        }

        for(int i = 0; i < n; i++) {
            result[i] = allProduct / nums[i];
        }
        return result;
    }
}