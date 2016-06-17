package school;

import javax.swing.JOptionPane;

public class SchoolController {

	/**
	 * // private String name; private int money; private String pw; private
	 * String ;1.등록 2.조회;홍길동,h(아이디),남만 보이게--조회영역
	 */

	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("1등록2조회0종료")) {
			case "1":JOptionPane.showMessageDialog(null, "1등록");break;
			case "2":JOptionPane.showMessageDialog(null, "2조회");break;
			case "0":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");break;

			default:
				break;
			}
		}
	
	
	}
	
}
