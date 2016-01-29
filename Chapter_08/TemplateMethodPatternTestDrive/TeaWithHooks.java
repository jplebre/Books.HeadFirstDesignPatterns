public class TeaWithHooks extends CaffeineBeverageWithHooks{
	public void brew() {
		System.out.println("Steeping the Tea");
	}

	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

	public boolean clientWantsCondiments(){
		String answer = super.getUserInput("Would you like a lemon?");

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
}