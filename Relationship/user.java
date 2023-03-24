package Relationship;

public class user {

		private String name;
		private long cNo;
		private String status;
		private int pswd;
//		Constructor
		public user(String name, long cNo, String status,int pswd) {
			this.name = name;
			this.cNo = cNo;
			this.status = status;
			this.pswd=pswd;
		}
		
//		getters and setters
		public String getName() {
			return name;
		}

		public long getcNo() {
			return cNo;
		}

		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		public int getpswd() {
			return pswd;
		}

		public void setPswd(int pswd) {
			this.pswd = pswd;
		}

}
