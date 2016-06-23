package matrix;

public class Zigzag {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int flag=1,k=1,i=0,j=0;  //증가값 k  ,flag값이 방향--진행방향을 바꾸는...
		
		for (i  = 0;i < 5; i++) {
			if (flag==1) {
				for (j = 0; j < 5; j++) {
					mtx[i][j]=k;
					k++;
				}
			} else {
				for (j =4; j >=0; j--) {
					mtx[i][j]=k;
					k++;
				}
					//여기를 채우시오(for-loop)
				}
			}
		flag*=-1;//여기를 채우시오(flag값 방향전환)
		
		for ( j = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println(mtx[i][j]+"\t");
			}
			System.out.println();
		}
		}
}
