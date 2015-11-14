public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";

		toppings.add("Shredded mozzarella cheese");
	}

	void cut(){
		System.out.println("cutting the pizza into square slices");
	}
}
