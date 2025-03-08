class Solution {
    public String solution(String s) {
        String[] c = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < c.length; i++) {
            max = Math.max(max, Integer.parseInt(c[i]));
            min = Math.min(min, Integer.parseInt(c[i]));
        }
        return String.format("%d %d", min, max);
    }
}