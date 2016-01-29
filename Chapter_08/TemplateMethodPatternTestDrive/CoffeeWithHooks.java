public class CoffeeWithHooks extends CaffeineBeverageWithHooks{
	public void brew() {
		System.out.println("Sripping coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	public boolean clientWantsCondiments(){
		String answer = getUserInput("Would you like milk and sugar?");

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
}