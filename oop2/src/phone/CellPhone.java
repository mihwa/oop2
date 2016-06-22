package phone;

	public class CellPhone extends Phone{
		private String move;//중복된 소스가 있는것 
		private boolean portable;//이동성
		public final static String KIND="휴대폰";//오버라이딩
		
		
		public String getMove() {
			return move;
		}
		public void setMove(String move) {
			this.move = move;
		}
		public boolean isPortable() {//is-불린타입은 참과 거짓만을 나타내므로 ..
			return portable;
		}
		public void setPortable(boolean portable) {
			if (portable) {
				this.setMove("이동가능");
			} else {
				this.setMove("이동불가능");
			}
			this.portable = portable;//
		}
		@Override
		public String toString() {
			return KIND+"이기때문에"+move+"," 
					+ super.getCompany() + "제품을 가지고," 
					+ super.getCall() + "(이)라고 통화했다";//상속은 상위것을 가져와 씀//super는 보이지 않지만 ..내것은 this이나 superdp
		}
		
}
