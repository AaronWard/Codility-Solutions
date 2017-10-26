class Solution {
    public int solution(int N) {
        int factorCount = 0;
        
        for(int i = 1; i <= N; i++){
            
         if(N%i == 0){
             factorCount++;
         }
        }
    
        return factorCount;    
    }
}