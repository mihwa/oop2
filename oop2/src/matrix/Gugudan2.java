package matrix;

public class Gugudan2 {
	public static void main(String[] args) {
		int [][] mtx= new int [5][5];
		int k=0;	
		
		for (int i = 1; i < 5; i++) {  //행(가로)
			for (int j = 0; j < 5; j++) {  //열(세로)
				k+=5;
				mtx [i][j]=k;
				System.out.print(mtx[i][j]+"\t");//
			}
			System.out.println();
			}
		}
	}

