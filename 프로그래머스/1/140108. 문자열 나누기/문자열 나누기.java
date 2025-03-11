class Solution {
    public int solution(String s) {
        int answer = 0;
        
        boolean x = false;
        char target = '0';
        int xcount = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!x) {
                target = s.charAt(i);
                x = true;
                xcount = 1;
            }
            else if(target == s.charAt(i)) {
                xcount++;
            }
            else {
                count++;
            }
            
            if(xcount == count) {
                xcount = 0;
                count = 0;
                answer++;
                x = false;
            }
        }
        
        if(xcount != count) answer++;
        
        return answer;
    }
}