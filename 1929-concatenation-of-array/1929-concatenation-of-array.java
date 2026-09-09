class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concat = new int[n * 2];
        for(int i = 0; i < n; i++) {
            concat[i] = concat[n + i] = nums[i];
        }

        return concat;
    }
}