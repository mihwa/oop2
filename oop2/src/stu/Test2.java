package stu;

import javax.swing.JOptionPane;

public class Test2 {
	 
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("1등록2조회0종료")) {
			case "1":JOptionPane.showMessageDialog(null, "등록");
				break;
			case "2":JOptionPane.showMessageDialog(null, "조회");
				break;
			case "0":JOptionPane.showConfirmDialog(null, "종료 ok?");
				return;

			default:
				break;
			}
			
		}
	}
}