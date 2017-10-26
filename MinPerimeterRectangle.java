import java.util.*
class Solution {
    public int solution(int N) {                
        int minPer = Integer.MAX_VALUE;
        
        
        for(int i = 1; i <= Math.sqrt(N); i++){
            
            if(N%i == 0 && 2*(i+N/i) < minPer){
                minPer = 2*(i+N/i);
            }
        } 
        return minPer;
        
    }
}