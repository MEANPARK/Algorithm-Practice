import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i = 0; i < n; i++) {
            arr.add((arr.get(i) + arr.get(i+1)) % 1234567);
        }
        answer = arr.get(n);
        return answer;
    }
}