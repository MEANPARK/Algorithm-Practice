class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] possible = {"aya", "ye", "woo", "ma"};

        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String str : babbling) {

            for (String check : impossible) {
                str = str.replace(check, "X");
            }
            
            for (String check : possible) {
                str = str.replace(check, "O");
            }
            
            int check = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'O') {
                    check++;
                    break;
                }
            }
            
            if (check == 0) answer++;
        }
        return answer;
    }
}