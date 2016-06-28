package map;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		String name="",id="",pw="",gender="";
		String temp="";
		MemberService service = new MemberServiceImple();//
		MemberBean member = new MemberBean();
		
		while (true) {
			switch (JOptionPane.showInputDialog("" + "--회원이 보는화면--\n" + "1회원가입 " + "2 로그인 3 내정보수정(비번) 4 탈퇴 0 종료\n"
					+ "--관리자화면--\n" + "11 회원등록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 ")) {
			case "1":
				temp =JOptionPane.showInputDialog("id,pw,name,gennder");
				String[]arr =temp.split(",");
				//JOptionPane.showInputDialog("이름");
				//JOptionPane.showInputDialog("아이디");
				//JOptionPane.showInputDialog("패스워드");
				//JOptionPane.showInputDialog("성별");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setGender(arr[3]);
				//service.saveData(name, id, pw, gender);
				;
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				temp=JOptionPane.showInputDialog("id,pw");
				member.setId(id);
				member.setPw(pw);
				JOptionPane.showMessageDialog(null, "service.login(member)");
				break;
			case "3":
				service.detail();
				break;
			case "4":
				service.updatePW(member);
				break;
			case "5":
				service.delete();
				break;
			case "11":
				service.list();
				break;
			case "12":
				service.findById(temp);
				break;
			case "13":
				service.findByName(temp);
				break;
			case "14":
				service.findByGender(temp);
				break;
			case "15":
				service.count();
				break;
				
			case "0":
				JOptionPane.showConfirmDialog(null, "종료합니다");
				return;

			default:
				break;
			}
		}
	}
}
