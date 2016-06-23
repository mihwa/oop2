package lotto2;

import javax.swing.JOptionPane;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
		
				JOptionPane.showInputDialog("얼마치구입");
				lot.setMoney(5800); //lot.getMoney()//5800원이라면 1000원이니까 5줄산것
				//service.setLottos(lot); 
				int[][] lottos =service.getLottos();
				 for (int i = 0; i < lottos.length; i++) {
				service.sort(lottos[i]);
					 for (int j = 0; j < lottos[i].length; j++) { //뒤 [앞][뒤] for문만큼돈다
				
						 System.out.println(lottos[i][j]+"\t");
					 }	
					 System.out.println();
				}
		
	}
}
