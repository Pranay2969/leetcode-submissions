class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> rotten = new ArrayDeque<>();

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 2) {
                    rotten.offer(new int[]{r, c});
                } else if(grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int minutes = 0;

        while(!rotten.isEmpty()) {
            boolean rottenThisMinute = false;
            int size = rotten.size();

            for(int i = 0; i < size; i++) {
                int[] curr = rotten.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : dirs) {
                    int newR = dir[0] + r;
                    int newC = dir[1] + c;
                    if(newR >= 0 && newC >= 0 && newR < rows && newC < cols && grid[newR][newC] == 1) {
                        grid[newR][newC] = 2;
                        rotten.offer(new int[]{newR, newC});
                        freshOranges--;
                        rottenThisMinute = true;
                    }
                }
            }
            if(rottenThisMinute) {
                minutes++;
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }
}