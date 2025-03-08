import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 65; i <= 90; i++) {
            dictionary.put(Character.toString((char)i), i-64);
        }
        int order = 27;
        
        int targetIndex = 0;
        int plus = 1;
        while(targetIndex + plus <= msg.length()) {
            
            if(targetIndex < msg.length()) {
                if(dictionary.getOrDefault(msg.substring(targetIndex, targetIndex + plus), 0) != 0) {
                    plus++;
                }
                else {
                    list.add(dictionary.get(msg.substring(targetIndex, targetIndex + plus-1)));
                    dictionary.put(msg.substring(targetIndex, targetIndex + plus), order);
                    order++;
                    targetIndex += plus-1;
                    plus = 1;
                }
            }
            
        }
        list.add(dictionary.get(msg.substring(targetIndex, msg.length())));
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}



// import java.util.ArrayList;

// class Solution {
//   public int[] solution(String msg) {
//     ArrayList<String> dic = new ArrayList<String>();
//     ArrayList<Integer> result = new ArrayList<Integer>();

//     for(int i = 0 ; i < 26; i++) {
//         dic.add(String.valueOf((char)('A'+i)));
//     }

//     for(int i = 0 ; i < msg.length() ; i++) {
//         for(int j = dic.size()-1 ; j >= 0 ; j--) {
//             if(msg.substring(i).startsWith(dic.get(j))) {
//                 i += dic.get(j).length()-1;
//                 result.add(j+1);
//                 if(i+1 < msg.length())
//                     dic.add(dic.get(j)+msg.charAt(i+1));
//                 break;
//             }
//         }
//     }

//     int[] answer = new int[result.size()];

//     for(int i = 0 ; i < result.size() ; i++) 
//         answer[i] = result.get(i);

//     return answer;  
//   }
// }