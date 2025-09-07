https://www.naukri.com/code360/problems/next-greater-element-ii_6212757?leftPanelTabValue=PROBLEM

import java.util.*;

public class Solution {
    public static int[] nextGreaterElementII(int []a) {
        Stack<Integer> st = new Stack<>();
        int N = a.length;
        int[] ans = new int[N];
        for(int i=2*N-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=a[i%N]){
                st.pop();
            }
            if(i<N){
                ans[i%N] = st.isEmpty()? -1: st.peek();
            }
            st.push(a[i%N]);
        }
        return ans;
    }
}
