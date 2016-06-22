package phone;
/**
 * @date:2016. 6. 22.
 @author:{mycnex@gmail.com}
*@file :AndroidPhone.java
*@Story:
 */
	public class AndroidPhone extends IPhone{//유닉스(애플),윈도우(빌게이츠),리눅스(),
		public final static String BRAND="갤럭시노트";//화면을 확장한 alt+shift_sr//
		private String size,data;
		
		
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getData() {
			return data;
		}
		public void setData(String call,String size,String data) { //오버로딩
			
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
			this.data = 
					KIND+"이기때문에"
					+super.getMove()+"," 
					+ super.getCompany() + "제품을가지고\n"
					+ super.getCall() + "(이)라고 통화하고\n"
					+this.getSize()+"인치 큰 화면을 통해서\n"
					+"카톡으로"+data+"메세지 전달했다";
		}
		
		@Override
		public String toString() {
			return getData();
		
		}
	}
