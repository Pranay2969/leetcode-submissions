class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int currSum = 0;
        int count = 0;

        map.put(0, 1);
        for(int num : nums) {
            currSum += num;

            int diff = currSum - k;
            count += map.getOrDefault(diff, 0);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}