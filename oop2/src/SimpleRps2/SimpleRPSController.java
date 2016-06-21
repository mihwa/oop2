package SimpleRps2;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	
	public static void main(String[] args) {//instance v local v class v //MyConstants.BANK_NAME//
		JOptionPane.showMessageDialog(null,"==가위바위보 게임==" );
		SimpleRPRService service =new SimpleRPSServiceImpl();
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "GO?")) {
				case 0:
				JOptionPane.showMessageDialog(null, service.playGame(JOptionPane.showInputDialog("1가위 2바위 3보")));
					break;

				default:
					return;
				}
		}
		
	}
}
