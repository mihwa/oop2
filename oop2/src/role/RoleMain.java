package role;

public class RoleMain {
	public static void main(String[] args) {///한가지의 여러가지 역할을 하는 다형성--그것을 하나의 타입으로 묶을수있다
		Man[]roles =new Man[3];
		
		roles[0]=new Father();
		roles[1]=new Husband();
		roles[2]=new Employee();
	
		for (int i = 0; i < roles.length; i++) {
			roles[i].role();
		}
		Employee emp = (Employee) roles[2];
		emp.worry();
	}
}

