package phonetest;

	public class IPhone extends CellPhone {//상속은 I Can do it(부자관계같은느낌)  ,   implement는 I must do it(회사같은느낌)
		private String data;
		public final static String KIND="스마트폰";//오버라이딩
		public final static String BRAND="아이폰";  //
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return KIND+"이기때문에"+super.getMove()+"," 
					+ super.getCompany() + "제품을 가지고," 
					+ super.getCall() + "(이)라고 통화하고"
					+this.getData()+"를 문자로 보냈다";
		}
		
	}
