package controller;

import java.util.Scanner;

public class ArrAssign3{

	/**
	 * ������������� ����� 
	 * ������ ���� �Է¹ް� �л��� �̸��� ���̸� �Է¹ް� �̰��� ����ϼ���
	 */
	public void arrAssignexecute( int count  ) {
		Scanner scanner = new Scanner(System.in);
		int i = 0; count = 0;

		System.out.println("�л�������Դϱ�?");
		count = scanner.nextInt();
		String[] name = new String[count];// �ܺο��� �Է¹޴� �� ����Ʈ
		int[] age = new int[count];
		int[] num = new int[count];
		
		for (; i < count; i++) {// �л��̸� �� ���� �Է� //sequense...
			num[i]=i;
			System.out.println("�̸�: ");
			name[i] = scanner.next();
			System.out.println("����: ");
			age[i] = scanner.nextInt();
		}
		System.out.println("=================================\n");
		System.out.println("�й�   | �̸�    | ���� \n");
		System.out.println("==================================\n");
		for (i = 0; i < count; i++) {
			// System.out.println("�й�"+ num[i]:�л��̸�:"+name[i]+"�л�����"+age[i]);
			System.out.printf("%s\t%s\t%d\n", num[i], name[i], age[i]);
   break;	

	} 

	
}}