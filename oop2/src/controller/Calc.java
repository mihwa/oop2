package controller;

public class Calc {

	public String Calcexecute (int inputNum1,String opcode,int inputNum2){//calc에서는 밖을 향해나와야한다,  ()를 파아미터(매개변수라고한다 바리스타와 고객이직접받지않는다. 알바(프론트)

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

			System.out.println("1~5까지만 입력바랍니다");
			break;
		}
	 
			return num1+op+num2+"="+result;// 
		
	}//점유하지않고
	
	
}
