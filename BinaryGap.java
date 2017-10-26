// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        String binary = Integer.toBinaryString(N);
        int gap = 0;
       

        String[] bits = binary.split("");

        int x = 0;
        for(int i = 0; i < bits.length; i++){
            if(bits[i].equals("0")){
                x++;
            }
            if(bits[i].equals("1")){
                if(x > gap){
                    gap = x;
                }
                x = 0;
            }
        }        
        return gap;
    }
}