class Solution {
    public String solution(String s) {
        String answer = "";
        String ns = " " + s;
        int count = 0;
        for(int i = 1; i < ns.length(); i++) {
            if(ns.charAt(i-1) == ' ') count = 0;
            if(count % 2 == 0) answer += Character.toUpperCase(ns.charAt(i));
            else answer += Character.toLowerCase(ns.charAt(i));
            count++;
        }
        return answer;
    }
}