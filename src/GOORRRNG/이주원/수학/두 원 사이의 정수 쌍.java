class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int x = 1; x <= r2; x++) {
            long dots1 = (long) Math.ceil(Math.sqrt((double)r1*r1 - (double)x*x));
            long dots2 = (long) Math.floor(Math.sqrt((double)r2*r2 - (double)x*x));
            
            answer += dots2 - dots1 + 1;
        }
        return answer * 4;
    }
}