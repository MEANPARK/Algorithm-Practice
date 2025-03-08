class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int target = section[0] + m -1;
        int index = 1;

        while(section.length != index) {
            if(section[index] <= target) {
                index++;
            }
            else {
                answer++;
                target = section[index] + m -1;
            }
        }
        return answer;
    }
}