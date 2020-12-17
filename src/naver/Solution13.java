package naver;
//https://app.codility.com/demo/results/trainingFK6EV8-6HR/
import java.util.*;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2, 1, 1, 2, 3, 1};
		int result =0;
		
		result = solution(A);
		
		System.out.println(result);
	}

	
	static public int solution(int[] A)
	{
		int ret = 0;
		int temp = -1000000000;
		int count = 0;
		
		Arrays.sort(A);
		
		for(int i=0; i< A.length; i++)
		{
			if(temp != A[i]) {
				temp = A[i];
				count++;
			}
				
		}
		
		
		
		return count;
	}
	
}
