class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int maj = n / 3;
        int i = 0;
        while(i < n) {
            int max = 1;
            while(i < n - 1 && nums[i] == nums[i+1]) {
                max++;
                i++;
            }
            if(max > maj) res.add(nums[i]);
            i++;
        }

        return res;
    }
}