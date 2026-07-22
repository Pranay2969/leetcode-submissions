class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int ele : nums) {
            unique ^= ele;
        }

        return unique;
    }
}