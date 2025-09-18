import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {

        private Stack<int[]> stack;
        MinStack() {
            stack = new Stack<>();
        }
        void push(int num) {
            if(stack.isEmpty()){
                stack.push(new int[]{num,num});
            }else{
                int minSoFar = Math.min(num,stack.peek()[1]);
                stack.push(new int[]{num,minSoFar});
            }
        }
        int pop() {
            if(!stack.isEmpty()){
                return stack.pop()[0];
            }
            return -1;
            
        }
        int top() {
            if(!stack.isEmpty()){
                return stack.peek()[0];
            }
            return -1;
        }
        int getMin() {
            if(!stack.isEmpty()){
                return stack.peek()[1];
            }
            return -1;
        }
    }
}
