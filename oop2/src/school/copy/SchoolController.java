package school.copy;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import stu.StuServiceImpl;

public class SchoolController {	 
	/** 1.등록 : ssn,id,pw,name,gender 입력받음 ssn:주민번호 	 
     * 2.조회 : name,id,gender 조회 
 	 */ 
	public static void main(String[] args) {
		StuServiceImpl service = new StuServiceImpl(); 
	
	while (true) { 
		 
		switch (JOptionPane.showInputDialog("1,등록 2.보기 3수정 4삭제 0.종료")) { 
		case "1": 
				String spec = JOptionPane.showInputDialog("ID,PW,이름,SSN"); 
			String[] specArr = spec.split(","); 
				service.registStudent(specArr[0],specArr[1],specArr[2],specArr[3]); 
			break; 
		case "2": 
			JOptionPane.showMessageDialog(null, service.showStudent()); 
			break; 
		case "3": 
			service.updateStudent(JOptionPane.showInputDialog("비번입력")); 
			break; 
		case "4": 
			service.deleteStudent(); 
				break; 
		case "0": 
			return; 

		default:  JOptionPane.showMessageDialog(null, "잘못된 입력입니다."); 
			break; 

		}	
			
	}
		
	}
	
}
 