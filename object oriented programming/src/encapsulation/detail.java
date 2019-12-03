package encapsulation;

public class detail {
	
		/*public void display(String name,String adrs,int con,String email,String proof,int proofid) {
			System.out.println("name"+name);
			System.out.println("address"+adrs);
			System.out.println("contact"+con);
			System.out.println("email ID"+email);
			System.out.println("proof"+proof);
			System.out.println("proofid"+proofid);
			System.out.println("thaks");
		}*/
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getAdrs() {
			return adrs;
		}
		public void setAdrs(String adrs) {
			this.adrs = adrs;
		}
		public int getContact() {
			return contact;
		}
		public void setContact(int contact) {
			this.contact = contact;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getProof() {
			return proof;
		}
		public void setProof(String proof) {
			this.proof = proof;
		}
		public int getProofid() {
			return proofid;
		}
		public void setProofid(int proofid) {
			this.proofid = proofid;
		}
		String name;
		String adrs;
		int contact;
		String email;
		String proof;
		int proofid;
		
	}



