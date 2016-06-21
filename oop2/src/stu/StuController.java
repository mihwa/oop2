package stu;

import javax.swing.JOptionPane;

import school.StudentServiceImpl;

public class StuController {
		public static void main(String[] args) {
			StuServiceImpl service = new StuServiceImpl(); 
			
			while (true) {
				switch (JOptionPane.showInputDialog("1등록 2조회 3수정 4삭제 0종료")) {
				case "1":
					String spec = JOptionPane.showInputDialog("이름,아이디,비밀번호,주민번호");
					String[] specArr =spec.split(",");
					
					break;
				case "2":
					JOptionPane.showMessageDialog(null, service.showStudent());
					break;
				case "3":
					service.updateStudent(JOptionPane.showInputDialog(""));
					break;
				case "4":
					break;
				case "0":break;
				
				default:
					break;
				}
			}
		}
	
}
