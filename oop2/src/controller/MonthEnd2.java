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
	 *�����Է��ϸ� ������ �������� �˷��ִ� 
	 *���α׷�
	 *��,2���� 29�Ϸ�������
	 *1~12�� ��� ���ڸ� �Է��ϸ� �߸��� �Է°��Դϴ� ��� ��� 
	 **/
	public String MonthEndexecute(String month2){
		Scanner scanner=new Scanner(System.in);
		String month="",day="",result="";
				
		
		System.out.println("���Է�");
		month=month2;
		switch (month) {
		case "1":day="31��";break;
		case "2":day="29��";break;
		case "3":day="31��";break;
		case "4":day="31��";break;
		case "5":day="31��";break;
		case "6":day="31��";break;
		case "7":day="31��";break;
		case "8":day="31��";break;
		case "9":day="31��";break;
		case "10":day="31��";break;
		case "11":day="31��";break;
		case "12":day="31��";break;

	default: result= "1~12������ڸ� �Է��ϸ� �߸����Է°��Դϴ�";
		
		return result;
		}
		result=month+"���� ����"+day;
	return result;}
	
	
	
}

