package map;

import java.util.HashMap;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class HashMapEx {
	public static void main(String[] args) {
		String[] msg ={"Berlin","Dottmund","Frankfrut","Gelsenkirchen","Hamburg"};
		
		HashMap<Integer, String>map = new HashMap<Integer,String>(); //HashMap생성
		for (int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]);//맵에저장
			
			Set<Integer> keys = map.keySet();//set은 맵안에 키셋만 추출한다
			for(Integer n : keys)
				System.out.println(map.get(n));//맵에서 읽어오기
		}
	}
}
