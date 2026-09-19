package interface1;

public interface Payment {

	void creditCard();
	default void status() {
		System.out.println("Successfull");
	}
	
}
