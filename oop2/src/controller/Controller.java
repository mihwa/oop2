package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {//1��
		Scanner s=new Scanner(System.in);
		Calc calc=new Calc();
		MaxMin maxMin=new MaxMin();
		while (true) {//2��
			System.out.println("�޴�"//3��
					+ "1.����"
					+ "2.ī��Ǫ."
					+ "3.�ְ���������"//
					+ "0.����");
			
			switch (s.next()) {//4��
			case "1":
				System.out.println("num1,opcorde,num2 �Է��Ͻÿ�");
				System.out.println(calc.Calcexecute(s.nextInt(), s.next(),s.nextInt())); //calc .��ġ�� �ٷζ��
			break;
			case "2":
				
				break;
			case "3":System.out.println("�л���?");//ȸ���� �󸶳������𸣴ϱ� 
			int count=s.nextInt();
			int[]scores=new int[count];
			System.out.println("����?");
			for (int i = 0; i < scores.length; i++) {
				scores[i]=s.nextInt();
			}
				
				maxMin.execute(scores);//��Ʈ�� �ϰ� ���� ���콺��鼱å
				break;
			case "0":
				
				JOptionPane.showConfirmDialog(null, "Closing OK?");
				return;
			default:
				break;
			}
		}
	}
}
