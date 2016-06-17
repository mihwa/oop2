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

	public void setWeight(String weight) { // 외부에서 값을 입력하고있다_set=write ===>몸무게를
											// 쓰다
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

	// 속성에 클래스안에 메소드1.2 있는경우
	// --
	//
	public void saveDB(String n, String h,  String w){
			String name=n, result=""; 
			
	 		double height= Double.parseDouble(h),
	 				weight= Double.parseDouble(w),
	 		       kaup=0.0;	
	 		kaup=((weight/height)/100)/(height/100); 
	 		 
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
	 		
	 	}

	public String execute(String name,String height , String weight){ 
		Scanner s=new Scanner(System.in); 
		String result=""; 
 		double h=Double.parseDouble(this.height),
               w=Double.parseDouble(this.weight),
 		       kaup=0.0;
 		
 	kaup=((w/h)/100)/(h/100); 
 
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
 
 
 		//System.out.printf("%s의 BMI지수:+%.2f,이고%s");
 	
 	
	return name +"의 BMI지수는 +"+result+"이다";
 }

	public Object execute(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
}
