package lotto2;


	public interface LottoService {
		public void setLottos(LottoBean lot);
		public int[][] getLottos();
		public boolean isDuplication(int count,int num);
		public void sort(int[]arr);
		public int count(LottoBean lot);
	}
