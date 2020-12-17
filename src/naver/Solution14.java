package naver;
import java.util.*;
//https://app.codility.com/demo/results/trainingE8K994-UYV/
public class Solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-3, 1, 2, -2, 5, 6};
		int result =0;
		
		result = solution(A);
		
		System.out.println(result);
	}
	static public int solution(int[] A)
	{
		int ret1 = 0, ret2=0;
		int max = 0;
		int zeroExist = 0;
		Arrays.sort(A);
		
		for(int i = 0; i<A.length; i++)
		{
			if(A[i] == 0)
				zeroExist =1;
		}
		
		ret1 = A[0] * A[1] * A[A.length-1];
		ret2 = A[A.length-3] * A[A.length-2] * A[A.length-1];
		
				
		if(ret1 > ret2)
		{
			max = ret1;				
		}			
		else
		{
			max = ret2;
			
		}
			
		
		if(max < 0 && zeroExist == 1)
			return 0;
		else
			return max;
		
	}
}
