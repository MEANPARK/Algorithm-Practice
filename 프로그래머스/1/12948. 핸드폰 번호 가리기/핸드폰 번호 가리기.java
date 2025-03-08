import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] c = phone_number.toCharArray();
        if(c.length != 4) {
            for(int i = 0; i < c.length-4; i++) {
                c[i] = '*';   
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}