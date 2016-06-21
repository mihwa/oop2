package grade1;
/** 
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.  
	 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점, 
	 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A 
	 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요 
	 * [단]switch-case 문으로 해결하세요 
 */ 
public class GradeBean {//Bean은 수정하지않음
	private int kor,eng,math;
	private String name;
	
	public GradeBean(){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public void setKor(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		return "결과 [이름=" + name 
				+ "\n국어=" + kor 
				+ " \n영어=" + eng 
				+ "\n수학=" + math ;
	}
	
	
 } 






