package lotto;
//
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

		public void setNumber() {
			this.number= (int) ((Math.random()*45)+1);//
		}

		@Override
		public String toString() {
			return "LottoBean [money=" + money + ", number=" + number + "]";
		}
		
}
