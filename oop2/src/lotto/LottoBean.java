package lotto;

import java.util.Random;

public class LottoBean {
		private int money,number;

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public int getNumber() {
			this.setNumber();
			return number;
		}

		public void setNumber() {//은닉화로인해 return값
			Random random = new Random();//1번 bean부터로또를 구성하는 램덤숫자 하나발생//ctrl+shift+o
			this.number= (int) ((Math.random()*45)+1);//
		}

		@Override
		public String toString() {
			return "LottoBean [money=" + money + ", number=" + number + "]";
		}
		
}
