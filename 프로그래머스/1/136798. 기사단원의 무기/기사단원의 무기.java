import java.util.*;

class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        
        int[] counts = new int[5 + 1]; 
        for (int j = 1; j <= 5 / 4; j++) {
            counts[4 * j]++;
        }
        System.out.println(Arrays.toString(counts));
        
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}