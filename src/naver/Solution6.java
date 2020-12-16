package naver;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 3, 1, 4, 2, 3, 5, 4 };

		solution(5, A);
	}

	static public int solution(int X, int[] A) {
		// write your code in Java SE 8
		int cnt = 0;
		int ans = -1;
		int[] data = new int[X];
		for (int i = 0; i < A.length; i++) {
			if (data[A[i] - 1] == 0) {
				data[A[i] - 1] = 1;
				cnt += 1;
			}
			if (cnt == X) {
				ans = i;
				break;
			}
		}
		return ans;

	}
}
