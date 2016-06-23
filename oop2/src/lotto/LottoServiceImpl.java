package lotto;

public class LottoServiceImpl implements LottoService {
		private int[][] lottos; 
		private int[] lotto;
		private int count;//돈따른 회전수
		
	@Override
	public void setLottos(LottoBean lot) {//bean역할 원소값이되야한다_
		//회전수를 입력받아서 매트릭스로 로또 추첨
		
		this.count= this.count(lot);  //컨트롤러에서
		System.out.println("카운트"+count);
		this.lottos= new int[count][6];// 개체생성방식  --메트릭스방식--임시한줄짜리를 만들어서 그 숫자를 완성본에 옮겨담아본다
		this.lotto=new int[6];
		
		int i =0;
		if (count<0) {
			this.lottos=null;
		} else {
			for (count =0;count < lottos.length; count ++) {
				while (true) {
					lot.setNumber();
					int num = lot.getNumber();
					System.out.println("랜덤 "+num);
					if (isDuPlication(count, num)) {
						continue; 
					}

					this.lottos[count][i] = num;
					i++;
					if (i == 6) {
						i = 0;
						break;
					}
				}
			}
			}
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
		// 오름차순정렬(한줄만 ,줄단위로해당_세로정렬필요없고 가로정렬만필요 ) //lottos[i].length =
		// lotto.length
		for (int i = 0; i < lotto.length - 1; i++) {// 세로값
			for (int j = 0; j < lotto.length - i - 1; j++) {// 가로값
				if (lot[j] > lot[j + 1]) {
					// static void swap() {
					int temp = lot[j];
					lot[j] = lot[j + 1];
					lot[j + 1] = temp;
					// 응용한코드를 입력하세요

				}
			}
		}
	}
	
	@Override
	public int count(LottoBean lot) {
		// 회전수구하기
		return lot.getMoney()/1000;//1000단위 횟수추출하도록
	}

}
