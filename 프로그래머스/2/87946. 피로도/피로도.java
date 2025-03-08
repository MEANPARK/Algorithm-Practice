class Solution {
    
    public static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        
        boolean[] visited = new boolean[dungeons.length];
        
        quest(k, dungeons, visited, 0, 0);
        return answer;
    }
    
    public void quest(int k, int[][] dungeons, boolean[] visited, int index, int count) {
        if(dungeons.length == index) {
            answer = Math.max(answer, count);
            return;
        }
        
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] == true) continue;
            visited[i] = true;
            
            if(dungeons[i][0] <= k) {
                quest(k-dungeons[i][1], dungeons, visited, index+1, count+1);
            }
            else {
                quest(k, dungeons, visited, index+1, count);
            }
            visited[i] = false;
        }
        return;
    }
}