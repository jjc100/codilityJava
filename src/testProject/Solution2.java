package testProject;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		String sepcialStr = "!@#$%^&*()-';,./?><+abdd";

		String readValue;
		String lowerString;
		String speciaString;
		String continueString = null;
		String limitString;
		String returnStr;

		List<Integer> answer = new ArrayList<>();
		/*
		 * Scanner scan = new Scanner(System.in); readValue = scan.nextLine();
		 * 
		 */
		Solution2 sol = new Solution2();

		readValue = "...!@BaT#*.?.y.abcdefghijklm";
		lowerString = readValue.toLowerCase();

		speciaString = getSTRFilter(lowerString);

		continueString = speciaString;
		do {
			continueString = continueDotChange(continueString);
		}while(continueDotCheck(continueString));
		returnStr = continueString;
		
		while(returnStr.length() > 0 && (returnStr.charAt(returnStr.length()-1) == '.')) {
			returnStr = returnStr.substring(0, returnStr.length()-1);
		}
        while(returnStr.length() > 0 && (returnStr.charAt(0) == '.')) {
			returnStr = returnStr.substring(1, returnStr.length());
        }
		
		returnStr = returnStr.replaceAll(" ", "a");
		
		 if(returnStr.length()>=16)
				returnStr = returnStr.substring(0, 15);
		  
		
		while(returnStr.length() > 0 && (returnStr.charAt(returnStr.length()-1) == '.')) {
			returnStr = returnStr.substring(0, returnStr.length()-1);
		}
        while(returnStr.length() > 0 && (returnStr.charAt(0) == '.')) {
			returnStr = returnStr.substring(1, returnStr.length());
        }
			
       
	  System.out.println(returnStr.length());
      
        
		while(returnStr.length() < 3) {
			
			if(returnStr.length() > 0)
				returnStr = returnStr.concat(String.valueOf(returnStr.charAt(returnStr.length()-1)));
			else
				returnStr = returnStr.concat("a");
		}
			
			
		System.out.println(returnStr);
        //return returnStr;
	}

	public static String getSTRFilter(String str) {
		String str_imsi = "";
		String[] filter_word = { "!", "\"", "#", "$", "%", "&", "\\(", "\\)", "\\{", "\\}", "@", "`", "\\*", ":", "\\+",
				";", "<", ",", "\\^", "~", "|", "'", "\\[", "//]" ,"\\\\", "\\?"};

		for (int i = 0; i < filter_word.length; i++) {
			str_imsi = str.replaceAll(filter_word[i], "");
			str = str_imsi;
		}
		return str;
	}
	
	
	public static boolean  continueDotCheck(String str) {
		int o = '.';
		int d = 0;
		int p = 0;
		int n = 0;
		int limit = 2;
		
		for (int i = 0; i < str.length(); i++) {
			char tempVal = str.charAt(i);
			if (i > 0 && (p = o - tempVal) > -2 && (n = p == d ? n + 1 : 0) > limit - 2) {
				return true;
			}
			d = p;
		}
		return false;
	}
	
	public static String continueDotChange(String str) {
		int o = '.';
		int d = 0;
		int p = 0;
		int n = 0;
		int limit = 3;
		
		String retunrStr;
		for (int i = 0; i < str.length(); i++) {
			char tempVal = str.charAt(i);
			if (i > 0 && (p = o - tempVal) > -2 && (n = p == d ? n + 1 : 0) > limit - 3) {
				retunrStr = str.substring(0, i) + str.substring(i+1);
				return retunrStr;
			}
			d = p;
		}
		return str;
	}

	
}
