package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		int a =lot.getMoney();//set 리턴방식이올수없다는 걸 기억하고
		LottoService service = new LottoServiceImpl();
		StringBuffer buf = new StringBuffer();		
		
		String input=JOptionPane.showInputDialog("얼마치구입?");
		lot.setMoney(Integer.parseInt(input));   //lot.getMoney()//5800원이라면 1000원이니까 5줄산것
		service.setLottos(lot);  //박스에 담아보내는것 같이 보안_call by refarance
		int[][] lottos =service.getLottos();

		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);//sort는 한줄단위
			for (int j = 0; j < lottos[i].length; j++) { //뒤 [앞][뒤] for문만큼돈다
				buf.append(lottos[i][j]+"\t");
			//	System.out.print("로또:"+lottos[i][j]+"\t");
			} 
			buf.append("/");
		}
			int lottoSerialNo= (int) (Math.random()*999999+100000);
			File output = new File("C:\\eclipse\\lotto\\"+lottoSerialNo+".txt");
			BufferedWriter bw=null;
			String[] myLotto =buf.toString().split("/");//string을 int-->    /객체안 스트링으로 바꿀때-->투스트링
			try{
				bw = new BufferedWriter(new FileWriter(output, true));
				for (String lots : myLotto) {
					lots +=System.getProperty("line.separator");	
					bw.write(lots);
				}
			} catch(IOException e){
				e.printStackTrace();
			}finally {
				try {
					bw.flush();
					bw.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}


		
		}
	}					


