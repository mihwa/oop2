package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

public class AccountBean { //default constructor 기본생성자_생성자는 메소드//생성자 오버로딩_중복 정의
	private int accountNo;//
	private String name;
	private int money;
	private String pw;
	private String id;
	public final static String BANK_NAME="한빛은행"; 
	
	public AccountBean() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountBean(String name,String id,String pw) {
		this.accountNo = (int) ((Math.random()*999999)+100000);       
		this.name = name;
		this.id=id;
		this.pw=pw;
	}
	//public AccountBean() {//default constructor 기본생성자_생성자는 메소드//생성자 오버로딩_중복 정의
		// TODO Auto-generated constructor stub
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAccountNo(){
	this.accountNo=(int) ((Math.random()*999999)+100000); }   
	
	public int getaccountNo() {
		return this. accountNo;
	}
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this. money;
	}
	
	public String getPw() {
		return this.pw;
	}
	public String getId() {
		return this.id;
	}
	                   //  ()?:;
	
	
	@Override
	public String toString() {
		return "AccountBean [accountNo=" + accountNo + ", name=" + name + ", money=" + money + ", pw=" + pw + ", id="
				+ id + "]";
	}
	

}

