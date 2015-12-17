public class ChicagoStyleVeggiePizza extends Pizza{
	public ChicagoStyleVeggiePizza(){
		name = "Chicago Style Deep Dish Veggie Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";

		toppings.add("Shredded mozzarella cheese, Onions, Peppers");
	}

	void cut(){
		System.out.println("cutting the pizza into square slices");
	}
}
