import java.util.*;

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]= -1;
            else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}

✅ Time Complexity

Each element is pushed onto the stack once and popped at most once.
So total operations across the loop = O(n).
Collections.reverse(newarr) also takes O(n).
👉 Overall Time Complexity = O(n)

✅ Space Complexity
stack holds at most n elements → O(n).
newarr stores the result of size n → O(n).
👉 Overall Space Complexity = O(n)
