package collecton;

import java.util.List;
import java.util.Vector;

import school.StudentBean;//collection문제

public class VectorEx {  //배열(array)은 ===프라임(=연산)타입,컬렉션(o타입)은 ===객체타입을 담으려고 그러나 방식은 다르다(array가 더많아지면 Matrix
	public static void main(String[] args) {
	
	List<StudentBean> v = new Vector<StudentBean>();
	StudentBean searchMan=new StudentBean(); //null은 투명인간처럼 보이지않지만, 
	StudentBean hong = new StudentBean("hong", "1", "홍길동","800101-1");
	StudentBean kim = new StudentBean("kim", "1", "김유신","900101-1");
	StudentBean lee = new StudentBean("lee", "1", "이순신","010101-3");
		
		//자원추가
		v.add(hong);
		v.add(kim);
		v.add(lee);
		
		int a=0;
		a=5;
		
		//System.out.println("size:"+v.size());//배열의 .length
		//System.out.println(v.toString());
		String searchName="홍길동";
		searchMan=null;
		for (int i = 0; i < v.size(); i++) {    //size()는 method_기능_get방식
			if(v.get(i).getName().equals(searchName)){//==프라임타입은 연산자  // 객체는 기능과 속성
				
				searchMan=v.get(i);
		}
		}
		
	if (searchMan.getId()==null) {// serchMan은 object인데 프라임것쓰고있다
		System.out.println(searchName+"라는 이름은 없습니다");
	} else {
		System.out.println(searchMan.toString());
	}
	//if (!searchName.equals(searchMan).getName()) {
	//System.out.println(searchName+"라는 이름은 없습니다");
	//} else {
		System.out.println(searchMan.toString());
	//}

		if (v.contains(searchMan.getName())) { //searchName은 getName에 들어가야볼수있다
			//int index = 
			v.remove(v.indexOf(searchMan)); //존재여부는 객체자체로만
		}else{
			System.out.println("존재x");
			}
		
		System.out.println(v.size());

	}
		{
}
}