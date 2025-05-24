import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        
        for(String s : record) {
            String[] parts = s.split(" ");
            if(parts[0].equals("Enter") || parts[0].equals("Change")) {
                map.put(parts[1], parts[2]);
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : record) {
            String[] parts = s.split(" ");
            String part = "";
            
            if(parts[0].equals("Enter")) {
                part = map.get(parts[1]) + "님이 들어왔습니다.";
                list.add(part);
                
            } else if(parts[0].equals("Leave")) {
                part = map.get(parts[1]) + "님이 나갔습니다.";
                list.add(part);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}