package phone;

import javax.swing.JOptionPane;

public class PhoneCotroller {
	
	
	public static void main(String[] args) {//상속은 빈객체이다_ 획득형질은(스킬)유전되지 않는다_ 후천적으로 얻는것(기술이나 ..)
		Phone phone=new Phone();
		CellPhone cellphone=new CellPhone();
		IPhone iPhone=new IPhone();
		AndroidPhone androidPhone =new AndroidPhone(); 
		
		while (true) {
			switch (JOptionPane.showInputDialog("1유선폰 2휴대폰 3아이폰 4갤럭시노트 0종료")) {
			case "1":
			phone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
			phone.setCall(JOptionPane.showInputDialog("통화내용"));
			JOptionPane.showMessageDialog(null, phone.toString());
			break;
			case "2":
			cellphone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
			cellphone.setCall(JOptionPane.showInputDialog("통화내용"));
			cellphone.setPortable(true);//이동가능하다
			JOptionPane.showMessageDialog(null, cellphone.toString());
			break;
			case "3":
			iPhone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
			iPhone.setCall(JOptionPane.showInputDialog("통화내용"));
			iPhone.setData(JOptionPane.showInputDialog("문자내용"));
			iPhone.setPortable(true);// 이동가능하다
			JOptionPane.showMessageDialog(null, iPhone.toString());

				break;
			case "4":
				androidPhone.setData(JOptionPane.showInputDialog("통화내용"),
						JOptionPane.showInputDialog("사이즈"),
						JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null, androidPhone.toString());
					break;
			case "0":return;
			default:
				break;
			}
		}
 }
 }