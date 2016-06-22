package phonetest;

import javax.swing.JOptionPane;

public class PhoneCotroller {
	
	
	public static void main(String[] args) {//상속은 빈객체이다_ 획득형질은(스킬)유전되지 않는다_ 후천적으로 얻는것(기술이나 ..)
		Phone phone=new Phone();
		CellPhone cellphone=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone androidphone=new AndroidPhone();
		
		
		while (true) {
			switch (JOptionPane.showInputDialog("1유선폰 2휴대폰 3아이폰 4갤럭시노트 0종료")) {
			case "1":
				phone.setCompany(JOptionPane.showInputDialog("어느회사제품입니까"));;
				phone.setCall(JOptionPane.showInputDialog("통화내용"));;
				JOptionPane.showConfirmDialog(null, phone.toString());
				break;
			case "2":
				cellphone.setCompany(JOptionPane.showInputDialog("어느회사제품입니까"));;
				cellphone.setCall(JOptionPane.showInputDialog("통화내용"));;
				JOptionPane.showConfirmDialog(null, cellphone.toString());
				break;
			case "3":
				iphone.setCompany(JOptionPane.showInputDialog("어느회사제품입니까"));;
				iphone.setCall(JOptionPane.showInputDialog("통화내용"));;
				JOptionPane.showConfirmDialog(null, iphone.toString());
				break;
			case "4":
				androidphone.setData(JOptionPane.showInputDialog("통화내용"));;
				JOptionPane.showInputDialog("사이즈");;
				JOptionPane.showInputDialog("카톡내용");;
				JOptionPane.showConfirmDialog(null, androidphone.toString());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				
				break;
			default:
				break;
			}
		}
 }
}