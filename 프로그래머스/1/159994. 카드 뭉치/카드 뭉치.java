class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer =  "";
        
        int x = 0;
        int y = 0;
        
        for(String str : goal) {
            if(cards1.length > x && str.equals(cards1[x])) {
                x++;
            }
            else if(cards2.length > y && str.equals(cards2[y])) {
                y++;
            }
            else return answer = "No";
        }
        
        answer = "Yes";
        
        return answer;
    }
}