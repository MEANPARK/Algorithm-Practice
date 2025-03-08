import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] nums = String.format("%d", n).split("");    
        
        int[] answer = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            answer[nums.length-1-i] = Integer.parseInt(nums[i]);
        }
        
        return answer;
    }
}