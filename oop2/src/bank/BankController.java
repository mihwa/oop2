package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

public class BankController  { 
 	
	private static final AccountService O = null;

	public static void main(String[] args) { 
 		AccountBean account = null; 
		AccountService ok=O;
 		 AccountService service=new AccountService();
		while (true) { 
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회 4.출금 5.통장내역 0.종료")) { 
			case "1": 
				String spec= JOptionPane.showInputDialog("이름,ID,PW");
				String[] specArr=spec.split(",");
				//String result[]=spec.split(",");
				service.openAccont(specArr[0],specArr[1],specArr[2]);
 					break; 
			case "2": 
  				String inputMoney = JOptionPane.showInputDialog("입금액?"); 
 				//account.setMoney(Integer.parseInt(inputMoney)); 
 				service.deposit(Integer.parseInt(inputMoney));
 				break; 
 				
 			case "3": 
 				//JOptionPane.showMessageDialog(null, service.findAccount()); 
 				break; 
 			case "4": 
 				String outputMoney=JOptionPane.showInputDialog("출금액?"); //출금액 아래 account.
 				service.withdraw(Integer.parseInt(outputMoney));
 				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
 				break; 
		
			case "5": 
				JOptionPane.showMessageDialog(null, service.showAccount()); 
				break; 
			
			default: 
 				JOptionPane.showConfirmDialog(null, "close?"); 
					
 				{
 					}
 				}
 				
		}

	}
}