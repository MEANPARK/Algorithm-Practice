class Solution {
    public int solution(int[] arr) {        
        int max = 0;
        int min = 0;
        int lcm = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max = 0;
            
            for(int j = 1; j <= lcm && j <= arr[i]; j++) 
            {
                if(lcm % j == 0 && arr[i] % j == 0)
                {
                    max = j;
                }
            }
            
            lcm = (lcm*arr[i])/max;
        }
        
        return lcm;
    }
}

