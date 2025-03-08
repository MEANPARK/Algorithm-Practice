import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] numString = String.valueOf(x).split("");
        int[] numArray = new int[numString.length];
        int i = 0;
        for(String num : numString) {
            numArray[i] = Integer.parseInt(num);
            i++;
        }
        answer = (x % Arrays.stream(numArray).sum() == 0)? true:false;
        return answer;
    }
}