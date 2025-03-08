class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        int num = 0;
        String tomp = "";
        for(int i = 0; i < arr1.length; i++) {
            tomp = Integer.toBinaryString(arr1[i]|arr2[i]);
            if(tomp.length() != n) tomp = "0".repeat(n-tomp.length()) + tomp;
            answer[i] = tomp.replace("1", "#").replace("0", " ");
        }
        return answer;
    }
}