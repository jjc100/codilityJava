package naver;
//https://app.codility.com/demo/results/trainingNXZDW3-525/
public class Solution12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {0, 1, 0, 1, 0, 1};
		int result =0;
		
		result = solution(A);
		
		System.out.println(result);
		
		
	}
	
	
	 static public int solution(int[] A) {
	        // write your code in Java SE 8
	        int sum=0;
	        int subSum=0;
	        int result=0;

	        for(int i=0; i<A.length; i++)
	        {
	            if(A[i] == 1)
	                sum += 1;
	        }

	        for(int i=0; i<A.length; i++)
	        {
	            if(A[i] ==1)
	                subSum++;
	            else
	            {
	            	result += sum - subSum;
	                
	            }                
	            
	        }
	        if(result > 1000000000 || result < 0)
	        	return -1;
	        else
	        	return result;
	    }
}
