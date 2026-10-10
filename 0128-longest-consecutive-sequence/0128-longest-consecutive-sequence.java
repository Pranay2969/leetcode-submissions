class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int longStreak = 0;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currentStreak = 1;
                int current = num;

                while(set.contains(current + 1)) {
                    current++;
                    currentStreak++;
                }

                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }
}