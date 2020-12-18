package naver;

import java.util.*;

public class Solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {4, 3, 2, 1, 5, 6};
		int B[] = {0, 1, 0, 0, 0, 1};
		
		int result;
		result = solution(A, B);
		
		System.out.println(result);

	}
	static public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
		
		int compareTemp;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
		for(int i=0; i<A.length; i++)
		{
			map.put(A[i], B[i]);
		}
		
		// 키로 정렬
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		
		compareTemp = map.get(map.size()).intValue();
		// 결과 출력
		 for(int i=map.size()-1; i>=0;i--)
		 {
			 count++;
             if(compareTemp != map.get(i).intValue())
             {
            	 break;
             }
             
         }
		
        return count;
	}
}
