public class CoffeeWithHooks extends CaffeineBeverage{
	public void brew() {
		System.out.println("Sripping coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	//Client wants condiments, no need to override
}