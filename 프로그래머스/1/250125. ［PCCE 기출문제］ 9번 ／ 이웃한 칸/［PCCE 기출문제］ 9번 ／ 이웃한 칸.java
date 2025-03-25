class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};
        
        for(int i = 0; i < 4; i++) {
            if(h + dh[i] < board.length && h + dh[i] > -1 && w + dw[i] < board[0].length && w + dw[i] > -1) {
                if(board[h][w].equals(board[h+dh[i]][w+dw[i]])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}