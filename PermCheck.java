// you can also use imports, for example:
// import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        boolean [] seen = new boolean[A.length];
        
        
		for (int i : A) {
			if (i < 1 || i > A.length || seen[i - 1]) {
				return 0;
			}
			seen[i - 1] = true;
		}
		return 1;
    }
}