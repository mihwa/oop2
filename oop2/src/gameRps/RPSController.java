package gameRps;

import java.util.Random;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
		Random random = new Random();
		int num = 0;

		RPSService service = new RPSServiceImpl();
		{

			while (true) {
				switch (JOptionPane.showInputDialog("1계속 0종료")) {
				case "1":
					String rps = JOptionPane.showInputDialog("1가위 2바위 3보");
					if (service.checkValidation(rps)) {
						service.betPlayerValue(Integer.parseInt(rps));
						service.setComputerValue();
						service.whoWin();
						JOptionPane.showMessageDialog(null, service.showResult());
					} else {
						continue;
					}
					break;

				case "2":
					break;
				case "3":

					break;

				default:
					break;
				}

			}

		}
	}
}