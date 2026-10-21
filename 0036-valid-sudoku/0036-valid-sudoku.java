class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char curr = board[i][j];
                if(curr == '.'){
                    continue;
                }

                String row = curr + "in row " + i;
                String col = curr + "in col " + j;
                String sec = curr + "in board pos " + (i / 3) + "-" + (j / 3);

                if(!set.add(row) || !set.add(col) || !set.add(sec)) {
                    return false;
                }
            }
        }

        return true;
    }
}