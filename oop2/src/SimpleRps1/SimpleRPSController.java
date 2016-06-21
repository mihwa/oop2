package SimpleRps1;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {//instance v local v class v //MyConstants.BANK_NAME
		JOptionPane.showMessageDialog(null,"==가위바위보 게임==" );
		SimpleRPRService service =new SimpleRPSServiceImpl();
		int comp=0, player=0;
		String result = "";
		Random r = new Random();
		SimpleRPS rp = new SimpleRPS();
		
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "GO?")) {
				case 0:
					String p =JOptionPane.showInputDialog("1가위 2바위 3보");
					result = service.gameEngine(result,r,p);// instance호출했으므로 instance메소드, 
				JOptionPane.showMessageDialog(null, result);
					break;

				default:
					return;
				}
		}
		
	}
}
