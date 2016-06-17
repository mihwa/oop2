package school;

//1.등록:,ssn,아이디,비번,이름 
//2.조회;홍길동,h(아이디),남만 보이게--조회영역//alt+shift+ss
public class Student {
	public final static String SCHOOL_NAME = "한빛학원";//상수 단하나만 구성-다른 클래스안구성 갖다가쓴다-프로젝트가 공유할수있다-
	private String id, pw, gender, name, regDate, ssn;//변수
	private int age, year;

	public void setId(String id){
		this.id=id;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setRegDate(String regDate){
		this.regDate=regDate;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setYear(int year){
		this.year=year;
	}
	
	public String getId(){
		return id;
	}
	public String getPw(){
		return pw;
	}
	public String getGender(){
		return gender;
	}
	public String getName(){
		return name;
	}
	public String getRegDate(){
		return regDate;
	}
	public String getSsn(){
		return ssn;
	}
	public int getAge(){
		return age;
	}
	public int getYear(){
		return year;
	}
	@Override
	public String toString() {
		
		
		return "학생명 [아이디=" + id + ", 패스워드=" + pw + ", 성별=" + gender + ", 이름=" + name + ", 등록일자=" + regDate
				+ ", 주민번호=" + ssn + ", 나이=" + age + ", 연도=" + year + "]";
	}
	
	
	
	
	
}// End of class
