package bank;

/**
 * @author hb2019
 *
 */
public class AccountServiceImpl implements AccountService2 {
	//1.개설. 2.입금 3.조회. 4.출금 5.통장내역 6.해지
		AccountBean account ;      //인스턴스변수는 초기화하지 않는다 String 
	//1.개설	
	@Override
	public void openAccont(String name, String id, String pw) {
		
		account = new AccountBean(name,id,pw);}

	@Override
	public void deposit(int inputMoneny) {
		//2.입금 
		int money =account.getMoney();
		money+=inputMoneny;
		account.setMoney(money);
	}

	@Override
	public void findAccount(String name) {
		// 3.
		
	}

	// 4.
	@Override
	public String withdraw(int output) {
		 String result="잔액이부족합니다.";
				int money=account.getMoney();
			if(output<=money){
				money-=output;//- 마이너스캐쉬 ...적용
				account.setMoney(money);
				result="출금 후 잔액"+money+"원입니다";
						}
			return result;
		
	}

	@Override
	public String showAccount() {
		//
		return account.toString();//
		
		
	}

	@Override
	public void deleteAccount() {
		//6.해지 
		account=null;
		
		
	}
	

}
