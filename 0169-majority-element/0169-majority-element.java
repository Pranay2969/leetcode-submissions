class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maj = 0;
        for(Map.Entry entry : map.entrySet()) {
            int key =(int) entry.getKey();
            int value =(int) entry.getValue();
            if(value > (nums.length / 2) && map.getOrDefault(maj, 0) < value) {
                maj = key;
            }
        }

        return maj;
    }
}