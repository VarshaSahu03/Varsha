import java.util.Scanner;

public class Solution {
	
	public static int sum(int[] arr) {
		//Your code goes here
		int n= arr.length;
		int sum=0;

		for(int i=0;i<n;i++){
            sum=sum+arr[i];

		}
		return sum;


	}
}
