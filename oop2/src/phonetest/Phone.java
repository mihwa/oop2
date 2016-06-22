package phonetest;

	public class Phone {  
		private String company,call;
		public final static String KIND="유선전화기";
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
			return "Phone [company=" + company + ", call=" + call + "]";
		} 
		
		
		
		
		}
	
	
