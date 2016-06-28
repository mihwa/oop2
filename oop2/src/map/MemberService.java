package map;
//**(""+"--회원이 보는화면--\n"+"1회원가입 "
//+ "2 로그인 3 내정보수정(비번) 4 탈퇴 0 종료\n"+"--관리자화면--\n"
//+"11 회원등록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 " //

public interface MemberService {
	
	public String join(MemberBean member);//MemberBean member노출되면 안되는것 감싸서 던진다
	public String login(MemberBean member);
	public void detail();
	public void updatePW(MemberBean member);
	public String delete();//탈퇴
	public void list();
	public MemberBean findById(String id);
	public void findByName(String name);
	public void findByGender(String gender);
	public int count();


	
}
