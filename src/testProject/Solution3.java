package testProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String first_time = "00:00:00";
		String play_time = "02:03:55";
		String adv_time = "00:14:15";
		String[] logs = { "01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29",
				"01:37:44-02:02:30" };
		
		int logNum = logs.length;
		int[][]containNum = new int[logNum][logNum];
		
		//String[] sepTime = new String[logs.length][];
		String[] start_time = new String[logs.length];
		String[] finish_time = new String[logs.length];
		
		Date [] date_parsed_logs_start = new Date[logs.length];
		Date [] date_parsed_logs_finish = new Date[logs.length];
				
		SimpleDateFormat input_format    = new SimpleDateFormat("HH:mm:ss", Locale.KOREA); // ÀÔ·ÂÆ÷¸ä
		
		Date date_parsed_play = input_format.parse(play_time);
		Date date_parsed_adv = input_format.parse(adv_time);
		
		
		
		
		if(date_parsed_play.getTime() <= date_parsed_adv.getTime())
			System.out.println(first_time);
		
		for(int i=0; i<logs.length; i++)
		{
			start_time[i] =	logs[i].substring(0, 8);
			finish_time[i] = logs[i].substring(9, 17);
			
			date_parsed_logs_start[i] = input_format.parse(start_time[i]);
			date_parsed_logs_finish[i] = input_format.parse(finish_time[i]);
		}
		
		
		//System.out.println(date_parsed_logs_start);
		//System.out.println(date_parsed_logs_finish);
			
		for(int i=0; i<logNum; i++)
		{
			for(int j=i+1; j<logNum; j++) {
				/*
				 * System.out.println(date_parsed_logs_start[i]);
				 * System.out.println(date_parsed_logs_start[j]);
				 * System.out.println(date_parsed_logs_start[i].getTime() -
				 * date_parsed_logs_start[j].getTime());
				 */
				if((date_parsed_logs_start[i].getTime() - date_parsed_logs_start[j].getTime()) <= 0 
						&& (date_parsed_logs_finish[i].getTime() - (date_parsed_logs_start[j].getTime()) >= 0) 
						|| date_parsed_logs_start[i].getTime()- (date_parsed_logs_start[j].getTime()) == 0) {
					containNum[i][j]++;
				}
			}
			
		}
		
		System.out.println(containNum);
		
		
		
		
		return;
		
		/*
		 * String readValue; String lowerString; String speciaString; String
		 * continueString = null; String limitString; String returnStr;
		 * 
		 * List<Integer> answer = new ArrayList<>();
		 * 
		 * Scanner scan = new Scanner(System.in); readValue = scan.nextLine();
		 * 
		 * 
		 * 
		 * readValue = "...!@BaT#*.\\\\.y.abcdefghijklm"; lowerString =
		 * readValue.toLowerCase();
		 * 
		 * speciaString = getSTRFilter(lowerString);
		 * 
		 * continueString = speciaString; do { continueString =
		 * continueDotChange(continueString); }while(continueDotCheck(continueString));
		 * returnStr = continueString;
		 * 
		 * while(returnStr.length() > 0 && (returnStr.charAt(returnStr.length()-1) ==
		 * '.')) { returnStr = returnStr.substring(0, returnStr.length()-1); }
		 * while(returnStr.length() > 0 && (returnStr.charAt(0) == '.')) { returnStr =
		 * returnStr.substring(1, returnStr.length()); }
		 * 
		 * returnStr = returnStr.replaceAll(" ", "a");
		 * 
		 * if(returnStr.length()>=16) returnStr = returnStr.substring(0, 15);
		 * 
		 * 
		 * while(returnStr.length() > 0 && (returnStr.charAt(returnStr.length()-1) ==
		 * '.')) { returnStr = returnStr.substring(0, returnStr.length()-1); }
		 * while(returnStr.length() > 0 && (returnStr.charAt(0) == '.')) { returnStr =
		 * returnStr.substring(1, returnStr.length()); }
		 * 
		 * 
		 * System.out.println(returnStr.length());
		 * 
		 * 
		 * while(returnStr.length() < 3) {
		 * 
		 * if(returnStr.length() > 0) returnStr =
		 * returnStr.concat(String.valueOf(returnStr.charAt(returnStr.length()-1)));
		 * else returnStr = returnStr.concat("a"); }
		 * 
		 * 
		 * System.out.println(returnStr);
		 */
		// return returnStr;
	}

	public static String getSTRFilter(String str) {
		String str_imsi = "";
		String[] filter_word = { "!", "\"", "#", "$", "%", "&", "\\(", "\\)", "\\{", "\\}", "@", "`", "\\*", ":", "\\+",
				";", "<", ",", "\\^", "~", "|", "'", "\\[", "//]", "\\\\" };

		for (int i = 0; i < filter_word.length; i++) {
			str_imsi = str.replaceAll(filter_word[i], "");
			str = str_imsi;
		}
		return str;
	}

	public static boolean continueDotCheck(String str) {
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
				retunrStr = str.substring(0, i) + str.substring(i + 1);
				return retunrStr;
			}
			d = p;
		}
		return str;
	}

}
