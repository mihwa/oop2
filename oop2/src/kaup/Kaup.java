package kaup;

import java.util.Scanner;

public class Kaup {

	String name, height, weight;

	public void setName(String name) {//
		this.name = name;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) { // �ܺο��� ���� �Է��ϰ��ִ�_set=write ===>�����Ը�
											// ����
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public String getHeight() {
		return this.height;
	}

	public String getWeight() {
		return this.weight;
	}

	// �Ӽ��� Ŭ�����ȿ� �޼ҵ�1.2 �ִ°��
	// --
	//
	public void saveDB(String n, String h,  String w){
			String name=n, result=""; 
			
	 		double height= Double.parseDouble(h),
	 				weight= Double.parseDouble(w),
	 		       kaup=0.0;	
	 		kaup=((weight/height)/100)/(height/100); 
	 		 
	 	 	if (kaup<18.5) { 
	 			result="��ü��"; 
	 		 
	 	 	}else if (kaup>18.4 && kaup<23) { 
	 			result="����ü��"; 
	 			 
	 	 	}else if (kaup>23 && kaup<25) { 
	 		    result="����ü��"; 
	 	 		 
	 		}else if (kaup>25&&kaup<30) { 
	 			result="��1�ܰ�"; 
	 	 		 
	 		}else if (kaup>30&&kaup<40) { 
	 		result="��2�ܰ�"; 
	 		 
	 		}else if (kaup>=40) { 
	 	 		result="��3�ܰ�"; 
	 		}
	 		
	 	}

	public String execute(String name,String height , String weight){ 
		Scanner s=new Scanner(System.in); 
		String result=""; 
 		double h=Double.parseDouble(this.height),
               w=Double.parseDouble(this.weight),
 		       kaup=0.0;
 		
 	kaup=((w/h)/100)/(h/100); 
 
 	if (kaup<18.5) { 
		result="��ü��"; 
	 
 	}else if (kaup>18.4 && kaup<23) { 
		result="����ü��"; 
		 
 	}else if (kaup>23 && kaup<25) { 
	    result="����ü��"; 
 		 
	}else if (kaup>25&&kaup<30) { 
		result="��1�ܰ�"; 
 		 
	}else if (kaup>30&&kaup<40) { 
	result="��2�ܰ�"; 
	 
	}else if (kaup>=40) { 
 		result="��3�ܰ�"; 
 	} 
 	//double d=Double.parseDouble(String.format("%.2f",kaup)); 
		 
		// * *System.out.println(name+"�� BMI������ "+d+"�̰�,+"+result+"�̴�");" 
 				//(������%d,���ڴ�%s,�Ҽ�����%f)- ��������printf�� �����Ͻÿ� //?():; 
 
 
 		//System.out.printf("%s�� BMI����:+%.2f,�̰�%s");
 	
 	
	return name +"�� BMI������ +"+result+"�̴�";
 }

	public Object execute(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
}
