import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < skill.length(); i++) {
            map.put(skill.charAt(i), i+1);
        }
        
        
        for(int i = 0; i < skill_trees.length; i++) {
            System.out.println(skill.indexOf(skill_trees[i].replaceAll("[^" + skill + "]", "")));
            int order = 1;
            for(int j = 0; j < skill_trees[i].length(); j++) {
                if(map.getOrDefault(skill_trees[i].charAt(j), 0) != 0) {
                    if(map.get(skill_trees[i].charAt(j)) == order) {
                        order++;
                    }
                    else {
                        order = 0;
                        break; 
                    }
                }
                
                if(order == skill.length()+1) {
                    break;
                }
            }
            if(order != 0) {
                answer++;
            }
        }
        return answer;
    }
}