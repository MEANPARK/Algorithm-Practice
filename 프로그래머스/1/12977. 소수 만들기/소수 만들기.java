import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
        
        ArrayList<Boolean> list = new ArrayList<>();
        
        list.add(false);
        list.add(false);
        
        int n = nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3]; 
        for(int i = 2; i <= n; i++) {
            list.add(true);
        }
        
        for(int i = 2; (i*i) <= n; i++) {
			if(list.get(i)) {
				for(int j = i*i; j <= n; j += i) list.set(j, false);
			}
		}
        
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    if(list.get(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }
}