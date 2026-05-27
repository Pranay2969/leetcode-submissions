class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int i = 1, j = 1;
        while(j < nums.length) {
            if(nums[i-1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
}