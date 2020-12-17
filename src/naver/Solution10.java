package naver;

public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		result =  solution(6, 8, 2);
		System.out.println("result : " + result);
		
		
	}
	
	static public int solution(int A, int B, int K)
	{
		int count = 0;
		
		for(int i = A; i <= B; i++)
		{
			if(i%K == 0)
				count++;
		}
		
		return count;
		
	}

}
