package naver;

import java.util.Stack;
//https://app.codility.com/demo/results/trainingR7ZS5A-W8X/
public class Solution16 {
	public static void main(String[] args) {
		String A =   ")(";
		int result =0;
		
		result = solution(A);
		
		System.out.println(result);
	}
	static public int solution(String S) {
        // write your code in Java SE 8
		Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<S.length(); i++)
        {
            switch(S.charAt(i))
            {
            case '(' :
            	stack.push(1);
            	break;
            case '{' :
            	stack.push(2);
            	break;
            case '[' :
            	stack.push(3);
            	break;
            case ')' :
            	if(stack.empty() || stack.pop() != 1)
            		return 0;
            	break;
            case '}' :
            	if(stack.empty() || stack.pop() != 2)
            		return 0;
            	break;
            case ']' :
            	if(stack.empty() || stack.pop() != 3)
            		return 0;
            	break;
            default :
            		
            }
            	
            
        }
        if(stack.empty())
        	return 1;
        else
        	return 0;
	}
    
    
}
