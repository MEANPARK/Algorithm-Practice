import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        int index1 = 0;
        int index2 = 0;
        while(index1+2 <= str1.length() || index2+2 <= str2.length()) {
            if(index1+2 <= str1.length()) {
                String checkStr1 = str1.substring(index1, index1+2);
                if(checkStr1.charAt(0) >= 65 && checkStr1.charAt(0) <= 90 && checkStr1.charAt(1) >= 65 && checkStr1.charAt(1) <= 90) {
                    list1.add(checkStr1);
                }
            }
            if(index2+2 <= str2.length()) {
                String checkStr2 = str2.substring(index2, index2+2);
                if(checkStr2.charAt(0) >= 65 && checkStr2.charAt(0) <= 90 && checkStr2.charAt(1) >= 65 && checkStr2.charAt(1) <= 90) {
                    list2.add(checkStr2);
                }
            }
            index1++;
            index2++;
        }
        
        int intersection = 0;
        for(String str : list1) {
            if(list2.contains(str)) {
                list2.remove(str);
                intersection++;
            }
        }
        
        int union = list1.size() + list2.size();
        
        if(union == 0) {
            if(str1.equals(str2)) {
                return 65536;
            }
            else return 1;
        }
        else {
            answer = (int)((double)intersection/union * 65536);   
        }
        return answer;
    }
}