class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, max = 0;
        Set<Character> seen = new HashSet<>();
        for(int right = 0; right < n; right++) {
            while(seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            max = Math.max(max, seen.size());
        }

        return max;
    }
}