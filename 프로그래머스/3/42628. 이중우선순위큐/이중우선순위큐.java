import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < operations.length; i++) {
            String[] str = operations[i].split(" ");
            if(str[0].equals("I")) {
                list.add(Integer.parseInt(str[1]));
                Collections.sort(list);
            }
            else if(list.size() != 0) {
                if(str[1].equals("-1")) {
                    list.remove(0);
                }
                else {
                    list.remove(list.size()-1);
                }
            }
        }
        
        if(list.size() != 0) {
            answer[0] = list.get(list.size()-1);
            answer[1] = list.get(0);
        }
        
        return answer;
    }
}