class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int length = triangle.length;
        
        int[][] floors = new int[length][length];
        
        for(int i = 0; i < length; i++) {
            floors[length-1][i] = triangle[length-1][i];
        }

        for(int i = length-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                floors[i][j] = triangle[i][j] + Math.max(floors[i+1][j], floors[i+1][j+1]);
            }
        }
        
        return answer = floors[0][0];
    }
}