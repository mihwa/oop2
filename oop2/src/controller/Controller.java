package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {//1번
		Scanner s=new Scanner(System.in);
		Calc calc=new Calc();
		MaxMin maxMin=new MaxMin();
		while (true) {//2번
			System.out.println("메뉴"//3번
					+ "1.계산기"
					+ "2.카우푸."
					+ "3.최고최저점수"//
					+ "0.종료");
			
			switch (s.next()) {//4번
			case "1":
				System.out.println("num1,opcorde,num2 입력하시오");
				System.out.println(calc.Calcexecute(s.nextInt(), s.next(),s.nextInt())); //calc .을치면 바로뜬다
			break;
			case "2":
				
				break;
			case "3":System.out.println("학생수?");//회전을 얼마나할지모르니까 
			int count=s.nextInt();
			int[]scores=new int[count];
			System.out.println("점수?");
			for (int i = 0; i < scores.length; i++) {
				scores[i]=s.nextInt();
			}
				
				maxMin.execute(scores);//컨트롤 하고 점에 마우스대면선책
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
