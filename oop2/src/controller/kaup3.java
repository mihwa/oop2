/**
 * 
 */
package controller;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :kaup.java
 * @story  :카우푸지수 완성
*/
public class kaup3 {
	public static void main(String[] args) { 
				Scanner scanner=new Scanner(System.in); 
				String name="",result=""; 
		 		double bmi=0.0,height=0.0,weight=0.0,kaup=0.0; 
		 		 
		 		//----op 
		 	System.out.println("이름?"); 
		 	name=scanner.next(); 
		 	 
		 	System.out.println("키?"); 
		 	height=scanner.nextDouble(); 
		 	 
		 	System.out.println("몸무게?"); 
		 	weight=scanner.nextDouble(); 
		 	 
		 
		 	kaup=((weight/height)/100)/(height/100); 
		 
		 
			 
		 		// 
		 	if (kaup<18.5) { 
	 		result="저체중"; 
			 
		 	}else if (kaup>18.4 && kaup<23) { 
	 		result="정상체중"; 
	 		 
		 	}else if (kaup>23 && kaup<25) { 
	 	    result="위험체중"; 
		 		 
	 	}else if (kaup>25&&kaup<30) { 
	 		result="비만1단계"; 
		 		 
	 	}else if (kaup>30&&kaup<40) { 
			result="비만2단계"; 
	 	 
	 	}else if (kaup>=40) { 
		 		result="비만3단계"; 
		 	} 
		 	//double d=Double.parseDouble(String.format("%.2f",kaup)); 
	 		 
	 		// * *System.out.println(name+"의 BMI지수는 "+d+"이고,+"+result+"이다");" 
		 				//(정수는%d,문자는%s,소수점은%f)- 위문장을printf로 변경하시오 //?():; 
		 
		 
		 		System.out.printf("%s의 BMI지수:+%.2f,이고%s"); 
		 } }
