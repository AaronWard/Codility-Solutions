/ you can also use imports, for example:
import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        int step = X;
        boolean [] leavesAppear = new boolean[X+1];
        
        
        for(int i = 0; i < A.length; i++){
         
            if(!leavesAppear[A[i]]){
                leavesAppear[A[i]] = true;
                
                step--;
            }
            if(step == 0){
             return i;   
            }
        }
		return -1;
    }
}