class Solution {
    public int solution(int num) {
        int answer = 0;
        long numLong = (long)num;
        for(int i = 1; i <= 500; i++) {
            if(numLong == 1) {
                break;
            }
            if(numLong % 2 == 0){
                numLong = numLong / 2;
                answer++;
            }
            else {
                numLong = (numLong * 3 + 1);
                answer++;
            }
        }
        if(numLong != 1) answer = -1;
        return answer;
    }
}