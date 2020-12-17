package naver;

//https://app.codility.com/demo/results/trainingMTB3TV-VK7/
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
//https://app.codility.com/demo/results/trainingDZNDTU-EHD/
//https://app.codility.com/demo/results/training3CW6MF-5P8/
//https://app.codility.com/demo/results/trainingCVF5AA-FG7/
//https://app.codility.com/demo/results/training9WE85W-9AT/
//https://app.codility.com/demo/results/training8TUY6J-7CV/
//https://app.codility.com/demo/results/trainingGGYJNM-CB9/
//https://app.codility.com/demo/results/trainingBJ5975-B97/
//https://app.codility.com/demo/results/training3BCV7Z-7SV/
//https://app.codility.com/demo/results/trainingC7MVUD-Y8M/
//https://app.codility.com/demo/results/trainingVHXYME-K45/?showingAll=1