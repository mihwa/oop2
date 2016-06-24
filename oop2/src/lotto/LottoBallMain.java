package lotto;

public class LottoBallMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
				StringBuffer sb= new StringBuffer();
				service.setLottoBall(lot);
				int[] lotto = service.getLottoBall();
				System.out.println("=== 로또추첨 ===");
				for (int i = 0; i < lotto.length; i++) {
					
					sb.append(lotto[i]+"\t");
				}
				System.out.println("\n"+sb);
				File output = new File("C:\\eclipse\\lotto\\lottoball.txt");
				BufferedWriter bw = null;
				String[]myLotto = sb.toString().split("/");
				
				try {
					 //뒤에 true는 이어쓰기
					bw = new BufferedWriter(new FileWriter(output,true));
					for(String lots : myLotto){
						lots += System.getProperty("line.separator");
						bw.write(lots);
					}
				} catch (Exception e) {
				}finally {
					
						try {
							bw.flush();
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					
				}
	}
}
