class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        int[] map = new int[50001];
        
        int max = 0;
        for(int i = 0; i < works.length; i++) {
            map[works[i]]++;
            max = Math.max(max, works[i]);
        }
        
        for(int i = max; i >= 0; i--) {
            if(n == 0) {
                answer += Math.pow(i,2) * map[i];
                continue;
            }
            
            if(map[i] != 0) {
                map[i]--;
                n--;
                if(i-1 != 0) {
                    map[i-1]++;
                }
                if(map[i] != 0) {
                    i++;
                }
            }
        }
        
        return answer;
    }
}

      /*Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < works.length; i++) {
            map.put(works[i], map.getOrDefault(works[i], 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        Collections.sort(keySet, Collections.reverseOrder());
        
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(map.getOrDefault(keySet.get(index), 0) == 0) {
                index++;
            }
            if(index == keySet.size()) break;
            
            int value = keySet.get(index);
            map.put(value, map.get(value) - 1);
            
            if(!keySet.contains(value-1) && value-1 > 0) {
                keySet.add(value-1);
                Collections.sort(keySet, Collections.reverseOrder());
            }
            
            if(index+1 != keySet.size()) {
                map.put(value-1, map.getOrDefault(value-1, 0) + 1);
            }
        }
        
        System.out.println(map);
        for(int key : keySet) {
            answer += Math.pow(key, 2) * map.get(key);
        }*/