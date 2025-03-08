class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int maxWallet = Math.max(wallet[0], wallet[1]); 
        int minWallet = Math.min(wallet[0], wallet[1]); 
        
        int maxbill = Math.max(bill[0], bill[1]); 
        int minbill = Math.min(bill[0], bill[1]);       

        while(!(minbill <= minWallet && maxbill <= maxWallet)) {
            if(bill[0] > bill[1])
                bill[0] /= 2;
            else
                bill[1] /= 2;
            minbill = Math.min(bill[0], bill[1]);
            maxbill = Math.max(bill[0], bill[1]);
            answer++;
        }
        return answer;
    }
}