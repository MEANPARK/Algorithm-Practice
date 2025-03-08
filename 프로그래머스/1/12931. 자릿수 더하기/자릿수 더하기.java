import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] digits = new int[10];
        int digit = 0;
        
        while(n > 0) {
            int m = n % 10;
            digits[digit++] = m;
            n = n / 10;
        }
        
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] != 0) {
                answer += digits[i];
            }
        }
        
        return answer;
    }
}