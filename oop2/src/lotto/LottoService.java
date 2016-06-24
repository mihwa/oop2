package lotto;

public interface LottoService {
	public void setLottos(LottoBean lot);//call by value  ---lot.getMoney로 가져와야한다
	public int[][] getLottos();
	public boolean isDuPlication(int count,int num);
	public void sort (int []arr);
	int count(LottoBean lot);
	
	
}
