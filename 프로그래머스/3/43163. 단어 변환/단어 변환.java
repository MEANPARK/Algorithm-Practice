class Solution {
    public static int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        
        dfs(begin, target, words, visited, 0);
        
        if(answer == Integer.MAX_VALUE) {
            answer = 0;
        }
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, boolean[] visited, int count) {
        if(begin.equals(target)) {
            answer = Math.min(answer, count);
            return;
        }
        
        for(int i = 0; i < words.length; i++) {
            if(visited[i]) {
                continue;
            }
            
            if(canChange(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, count+1);
                visited[i] = false;
            }
        }
    }
    
    public boolean canChange(String begin, String target) {
        int count = 0;
        if(begin.equals(target)) {
            return false;
        }
        
        for(int i = 0; i < begin.length(); i++) {
            if(begin.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        
        if(count == 1) {
            return true;
        }
        
        return false;
    }
}