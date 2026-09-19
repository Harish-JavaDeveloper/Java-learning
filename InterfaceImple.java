package interface1;

public class InterfaceImple implements Payment,Upi{

	@Override
	public void creditCard() {
		System.out.println("credt card payment done");
		
	}

	@Override
	public void upiPayment() {
		// TODO Auto-generated method stub
		System.out.println("upi payment done");
		
	}

	
	
	
}
