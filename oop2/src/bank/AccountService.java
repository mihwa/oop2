package bank;

import javax.swing.JOptionPane;

public class AccountService {//기능위주
	
	//1.개설. 2.입금 3.조회. 4.출금 5.통장내역 6.해지
	AccountBean account ;      //인스턴스변수는 초기화하지 않는다 String 
	
	//1.개설
	public void openAccont(String name,String id,String pw){
	account = new AccountBean(name,id,pw);
	
	}
	//2입금
	public void deposit(int inputMoneny){
		int money =account.getMoney();
		money+=inputMoneny;
		account.setMoney(money);
	}
	//3.조회
	public void findAccount(String name){
	}
	
	//4.출금
	public String withdraw (int output){
		String result="잔액이부족합니다.";
		int money=account.getMoney();
	if(output<=money){
		money-=output;//- 마이너스캐쉬 ...적용
		account.setMoney(money);
		result="출금 후 잔액"+money+"원입니다";
				}
	return result;
	}
	//5통장내역
	public String showAccount(){
		return account.toString();//
		
		}//6.해지
	public void deleteAccount(){
		account=null;
		
	 }
 }