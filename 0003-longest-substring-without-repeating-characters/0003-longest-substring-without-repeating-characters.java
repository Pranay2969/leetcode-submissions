class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int l = 0, r = 0;
        int n = s.length();
        int longStreak = 0;
        while(r < n) {
            char c = s.charAt(r);

            if(map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            map.put(c, r);
            longStreak = Math.max(longStreak, r - l + 1);
            r++;
        }

        return longStreak;
    }
}