import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<>();
        
        Set<Integer> set = new HashSet<Integer>();
        
        int sum = 0;
        
        for(int i = 0; i < elements.length; i++) {
            set.add(elements[i]);    
        }
        
        for(int i = 2; i <= elements.length; i++) {
            if(i == elements.length) {
                sum = 0;
                for(int l = 0; l < elements.length; l++) {
                    sum += elements[l];
                }
                set.add(sum);
            }
            else {
                for(int j = 0; j < elements.length; j++) {
                    sum = 0;
                    for(int k = 0; k < i; k++) {
                        sum += elements[(j+k)%elements.length];
                    }
                    set.add(sum);
                }
            }
        }
        return set.size();
    }
}