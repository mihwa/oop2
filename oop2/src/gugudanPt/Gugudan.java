package gugudanPt;

import java.util.Scanner;

/**
 * @date:2016. 6. 23.
 @author:{mycnex@gmail.com}
*@file :Gugudan.java
*@Story:
*
 *Scan으로 입력받아서/원하는 구구단의 단을/출력하시오
 *for문을 이용하세요
 **/
  public class Gugudan {
	public static void main(String[] args) {
		int k=0;  
		Scanner scanner =new Scanner(System.in);
		k=5;
		k=scanner.nextInt();//
		for (int i = 1; i < 10; i++) {
			System.out.println(i*k);
		}
	}
}
