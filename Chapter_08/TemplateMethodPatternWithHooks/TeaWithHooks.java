public class TeaWithHooks extends CaffeineBeverage{
	public void brew() {
		System.out.println("Steeping the Tea");
	}

	// Client doesn't want condiments, so we override:
	public boolean clientWantsCondiments(){
		return false;
	}

	// Now that we said clientWantsCondiments() returns false
	// This method will never be called:
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}	
}