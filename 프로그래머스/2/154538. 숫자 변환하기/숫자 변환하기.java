import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 1;
        
        if(x == y) return 0;
        
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(x, 0);
        
        boolean[] visited = new boolean[y*3];
        
        boolean flag = false;
        int count = 0;
        while(!que.isEmpty()) {
            int target = que.poll();
            
            if(!visited[target+n] && target+n < y) {
                visited[target+n] = true;
                que.add(target+n);
                map.put(target+n, map.getOrDefault(target, 0) + 1);
            }
            else if(target+n == y) {
                map.put(target+n, map.getOrDefault(target, 0) + 1);
                flag = true;
                break;
            }
            
            if(!visited[target*2] && target*2 < y) {
                visited[target*2] = true;
                que.add(target*2);
                map.put(target*2, map.getOrDefault(target, 0) + 1);
            }
            else if(target*2 == y) {
                map.put(target*2, map.getOrDefault(target, 0) + 1);
                flag = true;
                break;
            }
            
            if(!visited[target*3] && target*3 < y) {
                visited[target*3] = true;
                que.add(target*3);
                map.put(target*3, map.getOrDefault(target, 0) + 1);
            }
            else if(target*3 == y) {
                map.put(target*3, map.getOrDefault(target, 0) + 1);
                flag = true;
                break;
            }
        }
        
        if(!flag) {
            answer = -1;
        }
        else {
            answer = map.get(y);
        }
        return answer;
    }
}