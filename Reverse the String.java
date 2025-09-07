https://www.naukri.com/code360/problems/reverse-the-string_799927?leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int l=0;
		int r=str.length() -1;
		char temp;
		while(l<=r){
			temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		return new String(arr);
	}
}
