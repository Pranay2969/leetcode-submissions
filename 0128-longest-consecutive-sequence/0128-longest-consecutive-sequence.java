class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longStreak = 0;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int x = num;
                int curr = 1;
                while(set.contains(x + 1)) {
                    curr++;
                    x++;
                }
                longStreak = Math.max(longStreak, curr);
            }
        }

        return longStreak;
    }
}