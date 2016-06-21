package SimpleRps2;

import java.util.Random;

public class SimpleRPSServiceImpl implements  SimpleRPRService{
	
	@Override
	public String playGame(String  p) { //abstract__기능은 추상화하라  속성은 은닉화하고__class소속이 아니라 this를 없애고//나중에 interface끼움
		Random r= new Random();//속성값에대한 
		String result="";
		
		switch (p) {
		case "1":
			//player=1;
			//comp =r.nextInt(3)+1);//0.999가max
			
			switch (r.nextInt(3)+1) {
			case 1:	result="TIE";break;
			case 2:	result="LOSE";break;
			case 3:	result ="WIN";break;
			default:
				break;
			}
			break;
		case "2":
			switch (r.nextInt(3)+1) {
			case 1:	result="Win";break;
			case 2:	result="TIE";break;
			case 3:	result ="LOSE";break;
			default:
			break;
			}
		case "3":
			switch (r.nextInt(3)+1) {
			case 1:	result="LOSE";break;
			case 2:	result="WIN";break;
			case 3:	result ="TIE";break;
			
			}
		
		default:
			break;
			
		}
		return result;
	}

	@Override
	public String getResult(String result) {
		
		
		
		return "플레이어는:"+result;
	}

}
