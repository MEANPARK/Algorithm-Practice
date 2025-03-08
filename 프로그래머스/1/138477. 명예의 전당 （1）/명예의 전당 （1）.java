import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> klist = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(klist.size() < k) klist.add(score[i]);
            else if(klist.get(0) <= score[i]) {
                klist.add(score[i]);
                klist.remove(0);
            }
            Collections.sort(klist);
            answer[i] = klist.get(0);
        }
        System.out.println(klist.toString());
        return answer;
    }
}