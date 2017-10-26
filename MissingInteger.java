// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
		Set<Integer> numbers = new HashSet<Integer>();
		
		for (int i = 0; i < A.length;i++) {
			numbers.add(A[i]);
		}
		
		int i = 1;
		while(true){
   	    	if (!numbers.contains(i)) {
				return i;
			}
			i++;
		}
    }
}