package map;
//**(""+"--회원이 보는화면--\n"+"1회원가입 "
//+ "2 로그인 3 내정보수정(비번) 4 탈퇴 0 종료\n"+"--관리자화면--\n"
//+"11 회원등록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 " //

public class MemberBean {
  private String name, id,pw,gender;
 
  public void setName(String name){
	  this.name = name;
  }
  public void setId(String id){
	  this.id = id;
  }
  public void setPw(String pw){
		  this.pw = pw;
  }
  public void setGender(String gender){
	  this.gender= gender;
  }
  
  public String getName(){
	  return name;
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
@Override
public String toString() {
	return "회원정보 [이름=" + name + ", 아이디=" + id + ", 패스워드=" + pw + ", 성별=" + gender + "]";
}
  
}
