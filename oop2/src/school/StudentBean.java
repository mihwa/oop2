package school;
 //

	public class StudentBean {
	private String id, pw, gender, name, regDate, ssn;//변수
	private int age, year;
	
	public StudentBean(String id,String pw,String name,String ssn) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.ssn=ssn;
		this.regDate=regDate;
	}
	
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
		return  id;
	}
	public String getPw(){
		return  pw;
	}
	public String getGender(){
		return  gender;
	}
	public String getName(){
		return  name;
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
		return "Student2 [id=" + id + ", pw=" + pw + ", gender=" + gender + ", name=" + name + ", regDate=" + regDate
				+ ", ssn=" + ssn + ", age=" + age + ", year=" + year + "]";
	}
	
	}
	
// End of class
