import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String[] v = new String[]{"A", "E", "I", "O", "U"};
        
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < Math.pow(5, i); j++) {  
                String w = "";
                int num = j;

                for (int k = 0; k < i; k++) {
                    w = v[num % 5] + w;
                    num /= 5;
                }
                list.add(w);
            }
        }
        
        Collections.sort(list);
        
        answer = list.indexOf(word)+1;
        return answer;
    }
}
