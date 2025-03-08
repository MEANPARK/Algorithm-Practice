class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        if(s.length() % 2 == 0) {
            answer = String.format("%c%c", c[s.length()/2-1],c[s.length()/2]);
        }
        else if (s.length() == 1){
            answer = String.format("%c", c[0]);
        }
        else {
            answer = String.format("%c", c[(int)s.length()/2]);
        }
        return answer;
    }
}