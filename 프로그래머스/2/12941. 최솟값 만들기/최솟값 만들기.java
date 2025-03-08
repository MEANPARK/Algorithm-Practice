import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        int length = A.length;
        for(int i = 0; i < length; i++) {
            A1.add(A[i]);
            B1.add(B[i]);
        }
        Collections.sort(A1);
        Collections.sort(B1, Collections.reverseOrder());
        for(int i = 0; i < length; i++) {
            answer += A1.get(i) * B1.get(i);
        }
        
        return answer;
    }
}