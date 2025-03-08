class Solution {
    public long solution(int n) {
        
        return pebo(n, 0, 1);
    }
    
    public long pebo(int n, long p1, long p2) {
        long sum = p1+p2;
        if(n <= 1)
            return sum % 1234567;
        
        else {
            sum = pebo(n-1, p2, sum % 1234567);
        }
        
        return sum % 1234567;
    }
}