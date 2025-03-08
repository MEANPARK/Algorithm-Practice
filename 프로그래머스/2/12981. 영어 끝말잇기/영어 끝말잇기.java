import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> set = new HashSet<String>();
        double target = 0;
        
        set.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            if(set.contains(words[i])) {
                target = i+1;
                break;
            }
            set.add(words[i]);
            
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                target = i+1;
                break;
            }
            
        }
        
        if(target != 0) {
            if(target%n != 0) answer[0] = (int)((target)%n);
            else answer[0] = n;
            answer[1] = (int)Math.ceil((target)/n);
        }
        
        return answer;
    }
}