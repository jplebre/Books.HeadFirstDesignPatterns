public class PizzaTestDrive{
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza nyCheesePizza = nyStore.orderPizza("cheese");
		Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese");

		System.out.println("\n" + nyCheesePizza);
		System.out.println("\n" + chicagoCheesePizza);

		Pizza nyVeggiePizza = nyStore.orderPizza("veggie");
		System.out.println("\n" + nyVeggiePizza);

	}
}