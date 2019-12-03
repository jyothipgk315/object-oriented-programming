package encapsulation;

public class detail1 {
	String name;
	String adrs;
	String contact;
	String email;
	String proof;
	String proofid;
	int k,q,w,e;
	
	display1 r1=new display1();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name.matches("^[a-zA-Z]*$"))
        {
            this.name=name;
            k=0;
        }
        else
        {
        
           k=1;
        }
	}
	public String getAdrs() {
		return this.adrs;
	}
	public void setAdrs(String adrs) {
		if (adrs.matches("^[a-zA-Z]*$"))
        {
            this.adrs=adrs;
           q=0;
        }
        else
        {
         q=1;
        }
	}
	public String getContact()
    {
        return this.contact;
    }
	public void setContact(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contact=contact;
            w=0;
        }
        else
        {
        	
           w=1;
        }
    }
    

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		if (email.contains("@"))
        {
            this.email=email;
            e=0;
        }
        else
        {
        	
            e=1;
        }
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String getProofid() {
		return proofid;
	}
	public void setProofid(String proofid) {
		this.proofid = proofid;
	}

	public void check() {
		if(k==0&&q==0&&w==0&&e==0)
		{
			System.out.println("sucess");
			r1.display(name, adrs, contact, email, proof, proofid);
		}
		else 
			{if(k==1) {
			
			System.out.println("invalid name");
			
		}
		 if(q==1) {
			System.out.println("invalid addres");
			
		}
		if(w==1) {
			System.out.println("invalid contact");
			
		
		}
		 if(e==1) {
			System.out.println("invalid e-mail");
			
		
		}
		 System.out.println("registration not succces");
		 }
		
	}

}


