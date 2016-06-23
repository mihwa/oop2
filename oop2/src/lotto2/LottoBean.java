package lotto2;

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
			return number;
		}

		public void setNumber() {//
			Random random = new Random();//로또를 구성하는 램덤숫자 하나발생//ctrl+shift+o
			this.number= (int) ((Math.random()*45)+1);
		}

		@Override
		public String toString() {
			return "LottoBean [money=" + money + ", number=" + number + "]";
		}
		
}
