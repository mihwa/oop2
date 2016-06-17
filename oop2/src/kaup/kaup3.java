/**
 * 
 */
package kaup;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :kaup.java
 * @story  :카우푸지수 완성
*/
public class kaup3 {
	public String kaupexecute(String name2,double height2,double weight2){
		String name = "", result1 = "";
		double bmi = 0.0, height = 0.0, weight = 0.0, kaup = 0.0;

	    name = name2;
		height = height2;
		weight = weight2;

		kaup = ((weight / height) / 100) / (height / 100);

		//
		if (kaup < 18.5) {
			result1 = "저체중";

		} else if (kaup > 18.4 && kaup < 23) {
			result1 = "정상체중";

		} else if (kaup > 23 && kaup < 25) {
			result1 = "위험체중";

		} else if (kaup > 25 && kaup < 30) {
			result1 = "비만1단계";

		} else if (kaup > 30 && kaup < 40) {
			result1 = "비만2단계";

		} else if (kaup >= 40) {
			result1 = "비만3단계";
		}

		return name + "의 BMI지수는 " + Double.parseDouble(String.format("%.2f", bmi) + "이고,+" + result1);// 소수점을
																										// 2자리만표시하는
																										// float다(정수는%d,문자는%s,소수점은%f)-위문장을printf로
			
	}
	}

