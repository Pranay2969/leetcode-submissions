class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile : piles) {
            right = Math.max(right, pile);
        }

        int minspeed = right;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(canFinish(piles, h, mid)) {
                minspeed = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minspeed;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int totalhours = 0;
        for(int pile : piles) {
            totalhours += Math.ceil((double) pile / k);
        }

        return totalhours <= h;
    }
}