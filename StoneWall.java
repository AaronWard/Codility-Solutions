import java.util.*;
import java.util.Stack;

class Solution {
    public int solution(int[] H) {
        int numBlocks = 0;
        //make a new array, that is the same as H but add an extra index
        int [] height = Arrays.copyOf(H, H.length+1); 
        Stack<Integer> increasing = new Stack <Integer>();
            
        for(int h : height){
            //while stack isnt empty and top element is greater/equal to height
            while(!increasing.empty() && increasing.peek() >= h){
                
                //if top element is greater than height 
                if(increasing.peek() > h){
                    numBlocks++; // increment blocks
                }
                increasing.pop(); // remove top element
            }
            increasing.push(h);  //add h as element on the stack
        }
        return numBlocks;
    }
}