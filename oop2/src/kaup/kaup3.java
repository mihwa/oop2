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
 * @story  :ī��Ǫ���� �ϼ�
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
			result1 = "��ü��";

		} else if (kaup > 18.4 && kaup < 23) {
			result1 = "����ü��";

		} else if (kaup > 23 && kaup < 25) {
			result1 = "����ü��";

		} else if (kaup > 25 && kaup < 30) {
			result1 = "��1�ܰ�";

		} else if (kaup > 30 && kaup < 40) {
			result1 = "��2�ܰ�";

		} else if (kaup >= 40) {
			result1 = "��3�ܰ�";
		}

		return name + "�� BMI������ " + Double.parseDouble(String.format("%.2f", bmi) + "�̰�,+" + result1);// �Ҽ�����
																										// 2�ڸ���ǥ���ϴ�
																										// float��(������%d,���ڴ�%s,�Ҽ�����%f)-��������printf��
			
	}
	}

