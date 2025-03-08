import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] index = new int[3];
        int[] count = new int[3];

        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == answer1[index[0]%answer1.length]) count[0]++;
            if(answers[i] == answer2[index[1]%answer2.length]) count[1]++;
            if(answers[i] == answer3[index[2]%answer3.length]) count[2]++;
            index[0]++;
            index[1]++;
            index[2]++;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < 3; i++) {
            if(max <= count[i]) {
                max = count[i];
                maxIndex = i;
            }
        }
        
        for(int i = 0; i < 3; i++) {
            if(count[maxIndex] == count[i]) {
                arr.add(i+1);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}