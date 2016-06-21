package school;

public class StudentServiceImpl implements StudentService{ 
 	StudentBean stuBean; 
 	 
 	@Override 
 	public void registStudent(String name, String id, String pw, String ssn) { 
 		stuBean = new StudentBean(name, id, pw, ssn); 
 	} 
 
 
 	@Override 
 	public String 	showStudent() { 
 		return stuBean.toString(); 
 	} 
 
 
 	@Override 
 	public void updateStudent(String pw) { 
 		stuBean.setPw(pw); 
 	} 
 	@Override 
 	public void deleteStudent() { 
 		stuBean = null; 
 	} 
 	@Override 
 	public boolean checkPassword(String pw2){ 
 		return stuBean.getPw().equals(pw2) ? true : false; 
 	}


	@Override
	public String findStudent() {
		// TODO Auto-generated method stub
		return null;
	}


	
 	 
 } 
 