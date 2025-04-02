class Solution {
    public int solution(int n) {
        return pipo(1,1,n);
    }
    
    public int pipo(int a, int b, int n) {
        if(n == 1) return b;
        return pipo(b, (a+b)%1000000007, n-1);
    }
}