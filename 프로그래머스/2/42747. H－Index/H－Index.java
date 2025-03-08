import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int h = citations[0];
        int count = 0;
        if(h > citations.length) count = 1;
        
        for(int i = 1; i < citations.length; i++) {
            if(h <= citations.length - i) {
                h = citations[i];
                count = 0;
            }
            count++;
        }
        if(h == 0) count = 0;
        answer = count;
        
        return answer;
    }
}