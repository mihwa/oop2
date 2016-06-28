package map;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImple implements MemberService{
	
	Map<String,MemberBean> map ;
	
	public  MemberServiceImple() {
		map = new HashMap<String,MemberBean>();
	}

	@Override//1회원가입
	public String join(MemberBean member) {
		String result ="";
		if (map.containsKey(member.getId())) {
			result = "중복된ID";
			//?:;
		} else {
			map.put(member.getId(),member);
			result="가입성공";
		}
		
		
		return result;
	}

	@Override
	public String login(MemberBean member) {
		String result ="로그인 실패";
		if (map.get(member.getId()).getPw().equals(member.getPw())) {
			result ="로그인 성공";
		} else {
			result ="ID가 없습니다";
				
		}
		return null;
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePW(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id); 
		
	}

	@Override
	public void findByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByGender(String gender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		
		return map.size();
	}


	
	
}
