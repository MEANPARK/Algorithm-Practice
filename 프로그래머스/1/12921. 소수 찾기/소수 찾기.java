import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

		ArrayList<Boolean> list = new ArrayList<Boolean>(n+1);
        
		list.add(false);
		list.add(false);
        
		for(int i = 2; i <= n; i++) {
			list.add(i, true);
        }

		for(int i = 2; (i*i) <= n; i++) {
			if(list.get(i)) {
				for(int j = i*i; j <= n; j += i) list.set(j, false);
			}
		}
        
        for(int i = 2; i <= n; i++) {
            if(list.get(i)) {
                answer++;
            }
        }
        return answer;
    }
}