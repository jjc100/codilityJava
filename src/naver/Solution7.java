package naver;
import java.util.*;

public class Solution7 {
	
	static public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int result[] = new int[N];
        int max = 0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i] <= N)
            {
                result[A[i]-1] +=1;
                if(max < result[A[i]-1])
                    max = result[A[i]-1];
            }                
            
        }
        
        for(int i = 0; i<result.length; i++)
        {
        	if(max > 0 && max > result[i])
        		result[i] = max;
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 3, 4, 4, 6, 1, 4, 4 };

		solution(5, A);
	}
}
