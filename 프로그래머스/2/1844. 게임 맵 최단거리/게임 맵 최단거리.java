import java.util.*;
class Solution {
    
    public int[] pr = {-1, 1, 0, 0};
    public int[] pl = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        boolean[][] check = new boolean[maps.length][maps[0].length];
        
        Queue<Integer> rQue = new LinkedList<>();
        Queue<Integer> lQue = new LinkedList<>();
        
        rQue.add(0);
        lQue.add(0);
        
        check[0][0] = true;
        
        while(!rQue.isEmpty() && !lQue.isEmpty()) {
            int r = rQue.poll();
            int l = lQue.poll();
            
            for(int i = 0; i < 4; i++) {
                int nr = r + pr[i];
                int nl = l + pl[i];
                
                if(nr >= 0 && nr < maps.length && nl >= 0 && nl < maps[0].length) { 
                    if(maps[nr][nl] == 1 && !check[nr][nl]) {
                        check[nr][nl] = true;
                        maps[nr][nl] = maps[r][l] + 1;
                        rQue.add(nr);
                        lQue.add(nl);
                    }
                }
            }
        }
        
        if(check[maps.length-1][maps[0].length-1] == false) answer = -1;
        else answer = maps[maps.length-1][maps[0].length-1];
        
        return answer;
    }
        
//     public int dfs(int[][] maps, boolean[][] check, int index1, int index2, int count) {
//         if(index1 == 0 && index2 == 0) {
//             return count;
//         }
        
//         check[index1][index2] = true;
        
//         int num = maps.length * maps[0].length;

        
//         for(int i = 0; i < 4; i++) {
//             int r = index1 + pr[i];
//             int l = index2 + pl[i];
            
//             if(r >= 0 && r < maps.length && l >= 0 && l < maps[0].length && maps[r][l] != 0) {
                
//                 if(!check[r][l]) {
                    
//                     int n = dfs(maps, check, r, l, count+1);
                    
//                     num = num > n ? n : num;
//                 }
//             }
//         }
//         check[index1][index2] = false;
        
//         return num;
//     }
}