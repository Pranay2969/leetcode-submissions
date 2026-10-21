class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            int[] freqArr = new int[26];
            for(char c : str.toCharArray()) {
                freqArr[c-'a']++;
            }

            String freq = Arrays.toString(freqArr);
            if(map.containsKey(freq)) {
                map.get(freq).add(str);
            } else {
                map.put(freq, new ArrayList<>());
                map.get(freq).add(str);
            }
        }

        for(List<String> group : map.values()) {
            groups.add(group);
        }

        return groups;
    }
}