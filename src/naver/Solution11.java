package naver;
//https://app.codility.com/demo/results/training9M76SE-KN8/
public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {10, 10, -1, 2, 4, -1, 2, -1};
		int result =0;
		
		result = solution(A);
		
		System.out.println(result);
		
		
	}
	
	static public int solution(int[] A) {
        // write your code in Java SE 8
        int index = 0;
        int ret = 10000;

        for(int i=0; i<A.length-1; i++)
        {
            if((A[i] < ret) && (A[i] + A[i+1]/2) < ret)
            {
                ret = A[i] + A[i+1] /2;
                index = i;
            }
        }
        return index;
    }


}
