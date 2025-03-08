class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int round = 0;
        int result = 0; //합계
        int count = 0;
        
        while(!s.equals("1")){
            count = 0;
            for(int i = 0; i <  s.length(); i++) {
                if(s.charAt(i) == '0') {
                    count++;
                }
            }
            s = s.replaceAll("0","");
            s = Integer.toBinaryString(s.length());
            round++;
            result += count;
        }
        answer[0] = round;
        answer[1] = result;
        return answer;
    }
}