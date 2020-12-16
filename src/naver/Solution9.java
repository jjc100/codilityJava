package naver;

public class Solution9 {
	
	static class Solution {
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int sum = 0;
	        int resultSum = 0;
	        for(int i=0; i< A.length; i++)
	        {
	            sum += i+1;
	            resultSum += A[i];
	        }
	      
	        if(resultSum == sum)
	            return 1;

	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
