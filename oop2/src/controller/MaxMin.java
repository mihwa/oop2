package controller;

import java.util.Scanner;

public class MaxMin {
	public String execute(int[]scores){
		/*
		 * �ְ����� 
		 * *
		 */
		
	int max=0,min=100;
		
		//int score1=s.nextInt();//score[0]
		//int score2=s.nextInt();//score[1]
		//int score3=s.nextInt();//score[2]......99����
		//....456..100
		for (int i = 0; i < scores.length;i++){
			
		if (scores[i]>max){
			max=scores[i];
		} 
		if(scores[i]>min){
			min=scores[i];
		}
		}
		return("�ְ���:"+max+"��/������:"+min+"��");//���ڿ������� Ÿ�� 
		
		
		}
	
}
