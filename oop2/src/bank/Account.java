package bank;


public class Account {
	private int accountNo;//
	private String name;
	private int money;
	private String pw;
	private String id;
	public final static String BANK_NAME="한빛은행"; 
	
	public Account(String name) {
		this.accountNo = (int) ((Math.random()*999999)+100000);//100000����999999/
		this.name = name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getaccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	public String getPw() {
		return pw;
	}
	public String getId() {
		return id;
	}
	

}
