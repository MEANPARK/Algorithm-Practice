import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Map<Character, Double> map = new HashMap<>();
        map.put('S', 1.0);
        map.put('D', 2.0);
        map.put('T', 3.0);
        
        int[] num = {0,0,0};
        int index = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            if(Character.isDigit(dartResult.charAt(i))) {
                if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                    i++;
                    num[index] = 10;
                }
                else num[index] = dartResult.charAt(i) - '0';
            }
            else if(map.getOrDefault(dartResult.charAt(i), 0.0) != 0.0) {
                num[index] = (int)Math.pow((double)num[index], map.get(dartResult.charAt(i)));
                if(i+1 != dartResult.length()) {
                    if(dartResult.charAt(i+1) != '*' && dartResult.charAt(i+1) != '#') {
                        index++;
                    }
                }
            }
            else if(dartResult.charAt(i) == '*') {
                num[index] *= 2;
                if(index > 0) {
                    num[index-1] *= 2;
                }
                index++;
            }
            else if(dartResult.charAt(i) == '#') {
                num[index] *= (-1);
                index++;
            }
        }
        for(int i = 0; i < num.length; i++) {
            answer += num[i];
        }
        return answer;
    }
}