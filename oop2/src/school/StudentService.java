/**
 * 
 */
package school;

/**
 * @author hb2019
 *
 */
     public interface StudentService { 
			 	public void registStudent(String name,String id,String pw,String ssn); 
			 	public String findStudent(); 
			 	public void updateStudent(String pw); 
			 	public void deleteStudent(); 
			 	public boolean checkPassword(String newPw);
				String showStudent(); 
			  
	
}
