class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int r = grid.length;
        int c = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> q = new ArrayDeque<>();

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if(grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int minutes = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!q.isEmpty() && freshOranges != 0) {
            int size = q.size();
            boolean rottenThisMinute = false;

            for(int i = 0; i < size; i++) {
                int[] curr = q.poll();

                for(int[] dir : dirs) {
                    int newR = curr[0] + dir[0];
                    int newC = curr[1] + dir[1];
                    if(newR >= 0 && newR < r && newC >= 0 && newC < c && grid[newR][newC] == 1) {
                        freshOranges--;
                        grid[newR][newC] = 2;
                        q.offer(new int[]{newR, newC});
                        rottenThisMinute = true;
                    }
                }
            }

            if(rottenThisMinute) {
                minutes++;
            }
        }

        return (freshOranges == 0) ? minutes : -1;
    }
}