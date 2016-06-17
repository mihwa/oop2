/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :MonthEnd.java
 * @story  :
*/
public class MonthEnd2 {
	/**
	 *월을입력하면 말일이 몇일인지 알려주는 
	 *프로그램
	 *단,2월은 29일로한정함
	 *1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다 
	 **/
	public String MonthEndexecute(String month2){
		Scanner scanner=new Scanner(System.in);
		String month="",day="",result="";
				
		
		System.out.println("월입력");
		month=month2;
		switch (month) {
		case "1":day="31일";break;
		case "2":day="29일";break;
		case "3":day="31일";break;
		case "4":day="31일";break;
		case "5":day="31일";break;
		case "6":day="31일";break;
		case "7":day="31일";break;
		case "8":day="31일";break;
		case "9":day="31일";break;
		case "10":day="31일";break;
		case "11":day="31일";break;
		case "12":day="31일";break;

	default: result= "1~12벗어난숫자를 입력하면 잘못된입력값입니다";
		
		return result;
		}
		result=month+"월의 말일"+day;
	return result;}
	
	
	
}

