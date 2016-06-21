package SimpleRps5;
// 가위.바위.보게임을 만들기

import java.util.Random;

public class SimpleRPSBean {//가위바위보 은닉화되어야한다 
	private int play,comp;
	private String value;
	
	public void setPlay(int play){
		
	}
	public void setComp(){
		this.comp =(int)(Math.random()*3+1);
	}
	
	public int getPlay(){
		return play;
	
	}
	public int getComp(){
		return comp;
	}
	
	
	public String setValue(int out){
		switch (out) {
		case 1:this.value="가위";break;
		case 2:this.value="바위";break;
		case 3:this.value="보";break;

		default:
			break;
		}
		
		return value;
	}
	@Override
	public String toString() {
		return "베팅값 [play=" + play + ", 컴퓨터=" + comp + ", value=" + value + "]";
	}
	
	}
	

