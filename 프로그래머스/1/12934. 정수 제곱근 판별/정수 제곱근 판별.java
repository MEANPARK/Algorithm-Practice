class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        double i = (sqrt-Double.valueOf(sqrt).intValue() == 0.0)?(Math.pow(sqrt+1,2)):-1;
        long answer = (long)i;
        return answer;
    }
}