package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

public class BankController2  { 
 	
		public static void main(String[] args) {

			while (true) {
				
				switch (JOptionPane.showInputDialog("1통장개설 2입금 3조회 4출금 5통장내역"
						+ " 11개설 12 전체계좌내역 13계좌번호조회 14 15 6해지 0종료")) {
				case "1":
					String spec=JOptionPane.showInputDialog("이름,패스워드,아이디");
					
					break;
				case "2":break;
				case "3":break;
				case "4":break;
				case "5":break;
				case "6":break;
				case "7":break;
				case "8":break;
				case "9":break;
				case "10":break;
				case "11":break;
				case "12":break;
				case "13":
				String searchAcc=JOptionPane.showInputDialog("");
				
					break;
				case "14":break;
				case "15":break;

				default:
					break;
				}
			}
		}
}