package interrface;

public class boa implements banka,bankb{
	//here we can see the multiple inheritance concept  
	// boa is an class we can access the propety banka and backb at a time 

	@Override
	public void nooftransation() {
		// TODO Auto-generated method stub
		System.out.println("the transaation rate in BOA is 4");	
	}

	@Override
	public void rateofinterest() {
		// TODO Auto-generated method stub
		System.out.println("the rate of interest in BOA is 11");
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		System.out.println("netbanking  is active");
	}

	
	 

}
