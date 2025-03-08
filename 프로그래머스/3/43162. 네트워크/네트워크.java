import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Integer> rQue = new LinkedList<>();
        boolean[] visited = new boolean[computers.length];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                rQue.add(i);
                visited = bfs(computers, rQue, visited);
                answer++;
            }
        }
        return answer;
    }
    
    public boolean[] bfs(int[][] computers, Queue<Integer> rQue, boolean[] visited) {
        while(!rQue.isEmpty()) {
            int r = rQue.poll();
            visited[r] = true;
            for(int j = 0; j < computers[r].length; j++) {
                if(r != j) {
                    if(computers[r][j] == 1 && !visited[j]) {
                        rQue.add(j);
                    }
                }
            }
        }
        return visited;
    }
}