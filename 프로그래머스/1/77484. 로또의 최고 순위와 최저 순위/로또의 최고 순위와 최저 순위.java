import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lotto = new ArrayList<>();
        
        int zeroCount = 0;
        for(int i = 0; i < lottos.length; i++) {
            lotto.add(lottos[i]);
            if(lottos[i] == 0) {
                zeroCount++;
            }
        }
        
        int count = 0;
        for(int i = 0; i < win_nums.length; i++) {
            if(lotto.contains(win_nums[i])) {
                count++;        
            }
        }
        
        int rank = 7 - count;
        if(rank == 7) rank = 6;
        int zeroRank = 7 - (count + zeroCount);
        if(zeroRank == 7) zeroRank = 6;
        
        if(rank < zeroRank) {
            answer[0] = rank;
            answer[1] = zeroRank;
        }
        else {
            answer[0] = zeroRank;
            answer[1] = rank;
        }
        return answer;
    }
}