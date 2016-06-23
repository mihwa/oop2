package lotto2;

public class LottoServiceImpl implements LottoService {
		private int[][] lottos; 
		private int[] lotto;
		private int count;//돈따른 회전수
		
	@Override
	public void setLottos(LottoBean lot) {//bean역할 원소값이되야한다
		//회전수를 입력받아서 매트릭스로 로또 추첨
		//this. count= this.count(lot);
		this.lottos= new int[count][6];
		this.lotto=new int[6];//
		int i =0;
		if (count<0) {
			this.lottos=null;
			
		} else {
			for (count = 0;count  < lottos.length;count ++) {
				while (true) {
					lot.setNumber();
					int num = lot.getNumber();
					//if (condition) {
						
					}
					
				}
					
					}
					//this.lottos[count][i]=num;
					i++;
				/*	if (condition) {//if문을 완성하시오
						
					}*/
				}
			
		
	
	

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다(완성)
		return lottos;
	}

	@Override
	public boolean isDuPlication(int count, int num) {
		// 중복방지(완성)
		for (int i = 0; i < lottos[count].length; i++) {
		if (lottos[count][i]==num) {
			return true;
		}	
		}
		return false;
	}

	@Override
	public void sort(int[] lot) {
		// 오름차순정렬(한줄만 ,줄단위로해당_세로정렬필요없고 가로정렬만필요 ) //lottos[i].length =  lotto.length
	for (int i = 0; i < lotto.length -1; i++) {
		for (int j = 0; j < lotto.length -i-1; j++) {
			
			//if (lot[j]>lot[j+1]) {
			//	static void swap() { 
				//	int temp;
				//	   values[0]=values[1];
				//	   values[1]=temp;
				//응용한코드를 입력하세요
			}
		}
	}
	
	@Override
	public int count(LottoBean lot) {
		// 회전수구하기
		return lot.getMoney();//1000단위 횟수추출하도록
	}

}
