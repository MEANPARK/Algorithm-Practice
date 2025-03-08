class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(String str: s.split("")) {
            if(str.equals("p") || str.equals("P")) pCount++;
            if(str.equals("y") || str.equals("Y")) yCount++;
        }
        
        answer = (pCount==yCount)?true:false;
        return answer;
    }
}