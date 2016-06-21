package SimpleRps1;

import java.util.Random;

public interface SimpleRPRService {
	public abstract String playGame (String player);//내가 먼저 배팅하고 가야하니까...내 플레이어값은 가지고 가야한다
	public abstract String getResult (String result);//
	String gameEngine(String result, Random r, String p);
	
}
