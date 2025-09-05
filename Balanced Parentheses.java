https://www.naukri.com/code360/problems/balanced-parentheses_8162202?leftPanelTabValue=PROBLEM


import java.util.*;

public class Solution {
    public static boolean isBalanced(String S){
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for(char ch:S.toCharArray()){
            if( ch=='(' || ch=='{' || ch=='[' ){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if( (ch==')' && top!= '(') || (ch=='}' && top!= '{') || (ch==']' && top!= '[')  ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

TC --> O(N)
SC --> O(N)
