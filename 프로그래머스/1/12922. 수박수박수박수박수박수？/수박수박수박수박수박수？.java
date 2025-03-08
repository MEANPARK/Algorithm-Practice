class Solution {
    public String solution(int n) {
        String answer = "";
        char[] c = new char[n];
        for(int i = 0; i < n; i++) {
            c[i] = (i % 2 == 0)? '수':'박'; 
        }
        answer = String.valueOf(c);
        return answer;
    }
}