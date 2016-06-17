package controller;

import java.util.Scanner;

public class ArrAssign3{

	/**
	 * 전교생몇명인지 몰라요 
	 * 전교생 수를 입력받고 학생의 이름과 나이를 입력받고 이것을 출력하세요
	 */
	public void arrAssignexecute( int count  ) {
		Scanner scanner = new Scanner(System.in);
		int i = 0; count = 0;

		System.out.println("학생수몇명입니까?");
		count = scanner.nextInt();
		String[] name = new String[count];// 외부에서 입력받는 값 리미트
		int[] age = new int[count];
		int[] num = new int[count];
		
		for (; i < count; i++) {// 학생이름 및 나이 입력 //sequense...
			num[i]=i;
			System.out.println("이름: ");
			name[i] = scanner.next();
			System.out.println("나이: ");
			age[i] = scanner.nextInt();
		}
		System.out.println("=================================\n");
		System.out.println("학번   | 이름    | 나이 \n");
		System.out.println("==================================\n");
		for (i = 0; i < count; i++) {
			// System.out.println("학번"+ num[i]:학생이름:"+name[i]+"학생나이"+age[i]);
			System.out.printf("%s\t%s\t%d\n", num[i], name[i], age[i]);
   break;	

	} 

	
}}