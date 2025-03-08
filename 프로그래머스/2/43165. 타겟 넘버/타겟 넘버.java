class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public int dfs(int[] numbers, int target, int current, int index) {
        if(index == numbers.length) {
            if(current == target) return 1;
            else return 0;
        }
            
        int cnt = 0;
            
        cnt += dfs(numbers, target, current + numbers[index], index+1);
        cnt += dfs(numbers, target, current - numbers[index], index+1);
        return cnt;    
    }
}