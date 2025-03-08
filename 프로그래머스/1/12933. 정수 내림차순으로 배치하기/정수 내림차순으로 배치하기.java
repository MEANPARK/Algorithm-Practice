import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int i = 0;
        
        String arr = String.valueOf(n);
        Integer[] sol = new Integer[arr.length()];
        
        for(String s : arr.split("")) {
            sol[i] = Integer.parseInt(s);
            i++;
        }
        Arrays.sort(sol, Comparator.reverseOrder());
        
        String arr2 = "";
        for(Integer d : sol) {
            arr2 += String.valueOf(d);
        }
        
        answer = Long.parseLong(arr2);
        
        return answer;
    }
}