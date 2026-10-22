class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int left = 0, max = 0;
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if(map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            max = Math.max(max, (right - left) + 1);
        }

        return max;
    }
}