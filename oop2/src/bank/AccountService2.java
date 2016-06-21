package bank;

public interface AccountService2 {

	//1.개설. 2.입금 3.조회. 4.출금 5.통장내역 6.해지
      //인스턴스변수는 초기화하지 않는다 String 
	
	//1.개설
	public abstract void openAccont(String name,String id,String pw);
	//2입금
	public void deposit(int inputMoneny);
	//3.조회
	public void findAccount(String name);
	
	//4.출금
	public String withdraw (int output);
	//5통장내역
	public String showAccount();
	
	//6.해지
	public void deleteAccount();
 }
	
	
	

