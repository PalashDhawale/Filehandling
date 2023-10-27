package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable
	{
		private int eId;
		private String eName;
		private String address;
		public Employee()
		{
			
		}
		public Employee(int eId, String eName, String address) {
			super();
			this.eId = eId;
			this.eName = eName;
			this.address = address;
		}
		public int geteId() {
			return eId;
		}
		public void seteId(int eId) {
			this.eId = eId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
		}
		
		
		

	}

