package bank;

import javax.swing.JOptionPane;

public class BankController {

	public static void main(String[] args) {

		int ok = 0;
		Account account = null;// 보안위해 생성자가 필요하다

		while (true) {

			switch (JOptionPane.showInputDialog("1. 개설 2.입금 3.출금  4.계좌번호 5.종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null, "계좌개설 YES?");
				if (ok == 0) {
					account = new Account(JOptionPane.showInputDialog("이름"));
				} else {
					continue;
				}
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				account.setMoney(Integer.parseInt(inputMoney));
				break;

			case "3":
				String outputMoney = JOptionPane.showInputDialog(null, "출금");
				account.setMoney(Integer.parseInt(outputMoney));

				break;

			case "4":
				JOptionPane.showMessageDialog(null, "이름:" + account.getName() + "계좌번호 : " + account.getaccountNo());// 인스턴스를
																													// 통해
				break;

			default:

				ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if (ok == 0) {

				}
				return;
			}
		}

	}
}