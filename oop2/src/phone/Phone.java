package phone;

	public class Phone {  //alt+shift+sr_getta,setta단축키
		private String company,call;//Lv는 힙에 저장
		public final static String KIND="유선전화기";  //KIND는 static에저장, 항상변하지 않는 상수_constant,상수풀 
		
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCall() {
			return call;
		}
		public void setCall(String call) {
			this.call = call;
		}
		
		@Override
		public String toString() {
			return KIND+"인" + company + "제품을 가지고," 
		+ call + "(이)라고 통화했다";
		}
		
		
		}
	
	
