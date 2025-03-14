class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            char target = s.charAt(i);
            while(count < index) {
                if(target == 'z') {
                    target = 'a';
                }
                else {
                    target++;
                }
                
                if(!skip.contains(target+"")) {
                    count++;
                }
            }
            answer.append(target);
        }
        
        return answer.toString();
    }
}