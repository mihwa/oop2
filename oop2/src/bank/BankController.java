package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

public class BankController  { 
 	
	private static final AccountService O = null;

	public static void main(String[] args) { 
 		String spec="";
 		String[]specArr= new String [3];
		AccountBean account = null; 
		AccountService ok=O;
 		
		while (true) { 
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회 4.출금 5.통장내역"
					+ "11.개설 12조회(전체) 13조회(계좌번호) 14  0.종료")) { 
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				String[] specArr1 = spec.split(",");
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
			//	account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
			//	JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				break;
			case "5":
				break;
				
			case "11": 
		 spec = JOptionPane.showInputDialog("이름,비밀번호,아이디입력");
		 specArr1=spec.split(",");
		 AccountBean acc = new AccountBean();
		 acc.setAccountNo();
		 acc.setName(specArr1[0]);
		 acc.setId(specArr1[1]);
		 acc.setPw(specArr1[2]);
		
			case "12": 
				break; 
			case "13": 
				break; 
			case "14": 
				break; 
			case "15": 
				break; 
			case "16y": 
				break;
			case "18": 
				break; 
			default: 
 				JOptionPane.showConfirmDialog(null, "close?"); 
					
 				{
 					}
 				}
 				
		}

	}
}