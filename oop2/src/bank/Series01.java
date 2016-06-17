package bank;
//*//** 학생수는/ 입력받습니다.학생의 점수만 입력해서/최고점과 최저점만/ 출력/하는로직을 작성하시오 1+2+4+7+11+16+...의 순서로  나열되는 수열의  20번째 항까지의 합계//*

 	public class Series01 {
 		
	public static void main(String[] args) {
		int su = 1, sum=0;
		for (int i = 0; i < 20; i++) {
			su = su + i;
			System.out.printf("%d\t",su);
			
		}

	}

}