package naver;

public class Solution20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static public int solution(int[] A)
	{
		
		int max= -10000;
		int sum1[] = new int[A.length];
		int sum2[] = new int[A.length];
		int sum=0;
		int index=0;
		
		if(A.length < 4)
	        return 0;
		
		for(int i=1; i<A.length; i++)
		{
			sum1[i] = sum1[i-1] +A[i];
		}
		
		for(int i=1; i<A.length-1; i++)
		{
			sum2[i] = sum2[i-1] +A[i];
		}
		
		for(int i=1; i<A.length-1; i++)
		{
			sum = sum1[i] + sum2[i];
			if(max < sum)
			{
				max = sum;
				index = i;
			}
		}
		
		if(index <= 1 && index >= A.length-1 )
			return 0;
		
		return max;
	}
}
