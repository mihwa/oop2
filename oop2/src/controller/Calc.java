package controller;

public class Calc {

	public String Calcexecute (int inputNum1,String opcode,int inputNum2){//calc������ ���� ���س��;��Ѵ�,  ()�� �ľƹ���(�Ű���������Ѵ� �ٸ���Ÿ�� �������������ʴ´�. �˹�(����Ʈ)

		int num1 = inputNum1;
		String op=opcode;
		int num2 = inputNum2;
        int result=0;
        
		switch (op) {
		case "+":
			result = num1 + num2;
			op = "+";
			break;

		case "-":
			result = num1 - num2;
			op = "-";
			break;
		case "*":
			result = num1 * num2;
			op = "*";
			break;
		case "/":
			result = num1 / num2;
			op = "/";
			break;
		case "%":
			result = num1 % num2;
			op = "%";

			break;

		default:

			System.out.println("1~5������ �Է¹ٶ��ϴ�");
			break;
		}
	 
			return num1+op+num2+"="+result;// 
		
	}//���������ʰ�
	
	
}
