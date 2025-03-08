import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String nStr = Integer.toString(n, k);
        
        String[] nList = nStr.replace('0', ' ').trim().split("\\s+"); 
        
        for(int i = 0; i < nList.length; i++) {
            if(isPrime(Double.parseDouble(nList[i]))) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(double d) {
        if(d <= 1)
            return false;
        
        else if(d <= 3)
            return true;
        
        for(double i = 2; i <= Math.sqrt(d); i++){
            if(d%i == 0) return false;
        }
        
        return true;
    }
}