import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b) -> {
            // 파일 이름을 HEAD와 NUMBER로 분리
            String[] A = splitFileName(a);
            String[] B = splitFileName(b);
            
            // HEAD 비교
            int headCompare = A[0].compareToIgnoreCase(B[0]);
            if (headCompare != 0) {
                return headCompare;
            }
            
            // NUMBER 비교
            int numA = Integer.parseInt(A[1]);
            int numB = Integer.parseInt(B[1]);
            return Integer.compare(numA, numB);
        });
        return files;
    }

    // 파일 이름을 HEAD와 NUMBER로 분리하는 메소드
    private String[] splitFileName(String file) {
        String head = file.split("\\d")[0];
        String number = file.substring(head.length()).split("\\D+")[0];
        return new String[]{head, number};
    }
}