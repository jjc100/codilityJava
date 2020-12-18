package naver;

import java.util.Arrays;

public class Solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3, 4, 3, 2, 3, -1, 3, 3};
		
		int result;
		result = solution(A);
		
		System.out.println(result);
	}
	
	static public int solution(int[] A)
	{
		int sortArr[] = new int[A.length];
		int maxCount=0;
		int count=1;
		int index=-1;
		
		sortArr = A.clone();
		
		Arrays.sort(sortArr);
		
		for(int i=0; i<A.length-1; i++)
		{
			if(sortArr[i] == sortArr[i+1])
			{
				count++;
			}
			else
			{
				if(maxCount < count)
				{
					maxCount = count;
					index = i;
					
				}
				count = 1;
			}
		}
		
		if(index < 0 && maxCount >= A.length/2)
			return -1;
		
		for(int i=0; i<A.length; i++)
		{
			if(sortArr[index] == A[i])
			{
				index = i;
				break;
			}
		}
		
		
		return index;
		
	}
}
