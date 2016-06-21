package stu;
//
	public class StuBean {
		private String id, pw, gender, name, regDate, ssn;
		private int age, year;
		
		public StuBean(String id,String pw,String gender,String name,String regDate,String ssn)
		{
		this.id = id;   //this 현재의 인스턴스를 참조함
		this.pw =pw;
		this.gender=gender;
		this.name=name;
		this.regDate=regDate;
		this.ssn=ssn;
		this.age=age;
		this.year=year;
}
		
		public void setId(String id){
			this.id =id;
		}
		public void setPw(String pw){
			this.pw =pw;
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
			return "StuBean [id=" + id + ", pw=" + pw + ", gender=" + gender + ", name=" + name + ", regDate=" + regDate
					+ ", ssn=" + ssn + ", age=" + age + ", year=" + year + "]";
		}
		
		
		
}
