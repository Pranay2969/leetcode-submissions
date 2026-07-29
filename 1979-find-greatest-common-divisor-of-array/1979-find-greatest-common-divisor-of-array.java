class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return gcd(min , max);
    }
    int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}