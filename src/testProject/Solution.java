package testProject;


import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
        String readValue;
        List<Integer> answer = new ArrayList<>();
		/*
		 * Scanner scan = new Scanner(System.in); readValue = scan.nextLine();
		 * 
		 */
        Solution sol = new Solution();
        
        readValue = "[[1,1],[2,2],[1,2]]";
        String readValueStringArr[] = readValueStringArr = readValue.split(",");
        int readValueIntArr[];
        System.out.println(readValueStringArr.length);
		
        readValueIntArr = new int[readValueStringArr.length];
        
		  for(int i = 0; i <readValueStringArr.length; i++) 
		  {
			  //System.out.println("readValueStringAttr.size() :" +  readValueStringArr.length);
			  readValueStringArr[i] = readValueStringArr[i].replaceAll("\\[", "");
			  readValueStringArr[i] = readValueStringArr[i].replaceAll("\\]", ""); 
			  readValueIntArr[i] = Integer.parseInt(readValueStringArr[i]); 
			  
			 
		  }
		  for(int i=0; i< readValueStringArr.length; i++)
		  {
			  if( sol.searchOneCheck(readValueIntArr, readValueStringArr.length, i, readValueIntArr[i]) == -1)
				  answer.add(readValueIntArr[i]);
		  }
		  
		  if(!answer.isEmpty())
			  System.out.println(answer);
		  else
		  {
			  for(int i=0; i< readValueStringArr.length; i++) {
				  if( sol.searchTwoCheck(readValueIntArr, readValueStringArr.length, i, readValueIntArr[i]) == -1)
					  answer.add(readValueIntArr[i]);
		  		}
			  System.out.println(answer);
		  }
		  
		}
	
	int searchOneCheck(int arr[], int n, int index, int x) { // �Ű����� : �迭�̸�, �迭�� ����, ���� �ε��� ��, ã������ ��
	    int i;
	 
	    for (i = 0; i < n; i++) { // �迭 ��ü ���� Ž��
	 
	        if (arr[i] == x && i != index) { // ã�� �� �߰�
	 
	            return i; // �ش� ��ġ(�ε���) ��ȯ
	 
	        }
	 
	    }
	    return -1; // ã������ ���� �߰����� ���ϸ� -1 ��ȯ
	}
	
	int searchTwoCheck(int arr[], int n, int index, int x) { // �Ű����� : �迭�̸�, �迭�� ����, ���� �ε��� ��, ã������ ��
	    int check = 0;
		int i;
	 
	    for (i = 0; i < n; i++) { // �迭 ��ü ���� Ž��
	 
	        if (arr[i] == x && i != index) { // ã�� �� �߰�
	        	check++;
	        	if(check > 1)
	        		return i; // �ش� ��ġ(�ε���) ��ȯ
	        }
	    }
	    return -1; // ã������ ���� �߰����� ���ϸ� -1 ��ȯ
	}



}
