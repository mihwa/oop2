package gameRps;
// 가위.바위.보게임을 만들기

public class RPSBean {//가위바위보 은닉화되어야한다 
	private String play,comp;
	
	public void setPlay(String play){
		switch (play) {
		case "1":
			this.play="가위";
			break;
		case "2":
			this.play="바위";
			break;
		case "3":
			this.play="보";
			break;

		default:
			break;
		}
		this.play=play;
	}
	public void setComp(String comp){
		this.comp =comp;
	}
	
	public String  getPlay(){
		return play;
	
	}
	public String getComp(){
		return comp;
		
	}
	@Override
	public String toString() {
		return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
	}
	
}
