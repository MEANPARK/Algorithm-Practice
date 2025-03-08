class Solution {
    public int solution(String dirs) {
        int answer = 0;
        boolean[][][] visited = new boolean[11][11][5];
        
        int rStart = 5;
        int lStart = 5;
        
        //| U : 1 | D : 2 | R : 3 | L : 4 |
        for(int i = 0; i < dirs.length(); i++) {
            if(dirs.charAt(i) == 'U') {
                if(lStart + 1 < 11) {
                    if(!visited[rStart][lStart+1][1] || !visited[rStart][lStart][2]) {
                        visited[rStart][lStart+1][1] = true;
                        visited[rStart][lStart][2] = true;
                        answer++;
                    }
                    lStart += 1;
                }
            }
            else if(dirs.charAt(i) == 'D') {
                if(lStart - 1 >= 0) {
                    if(!visited[rStart][lStart-1][2] || !visited[rStart][lStart][1]) {
                        visited[rStart][lStart-1][2] = true;
                        visited[rStart][lStart][1] = true;
                        answer++;
                    }
                    lStart -= 1;
                }
            }
            else if(dirs.charAt(i) == 'R') {
                if(rStart + 1 < 11) {
                    if(!visited[rStart+1][lStart][3] || !visited[rStart][lStart][4]) {
                        visited[rStart+1][lStart][3] = true;
                        visited[rStart][lStart][4] = true;
                        answer++;
                    }
                    rStart += 1;
                }
            }
            else if(dirs.charAt(i) == 'L') {
                if(rStart - 1 >= 0) {
                    if(!visited[rStart-1][lStart][4] || !visited[rStart][lStart][3]) {
                        visited[rStart-1][lStart][4] = true;
                        visited[rStart][lStart][3] = true;
                        answer++;
                    }
                    rStart -= 1;
                }
            }
        }
        return answer;
    }
}