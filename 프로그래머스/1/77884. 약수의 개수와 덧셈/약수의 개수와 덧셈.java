class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        if(left == right) {
            for(int i = 0; i <= left; i++) {
                if(left % i == 0) count++;
            }
            answer += (count % 2 == 0)? (left):(-left); 
        }
        else {
            for(int i = left; i <= right; i++) {
                count = 0;
                for(int j = 1; j <= i; j++) {
                    if(i % j == 0) count++;
                }
                answer += (count % 2 == 0)? (i):(-i); 
            }
        }
        
        return answer;
    }
}