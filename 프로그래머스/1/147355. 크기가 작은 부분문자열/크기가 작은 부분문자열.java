class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str;
        long comp = 0;
        long pNum = Long.parseLong(p);
        for(int i = 0; i <= t.length() - p.length(); i++) {
            str = t.substring(i, p.length()+i);
            comp = Long.parseLong(str);
            if(comp <= pNum) answer++;
        }
        return answer;
    }
}