public class CaffeineBeverageTestDrive {
	public static void main(String[] args) {
		TeaWithHooks teaHook = new TeaWithHooks();
		CoffeeWithHooks coffeeHook = new CoffeeWithHooks();

		System.out.println("\nMaking Tea:");
		teaHook.prepareRecipe();

		System.out.println("\nMaking Coffee:");
		coffeeHook.prepareRecipe();
	}
}