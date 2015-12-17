public class ChicagoStylePepperoniPizza extends Pizza{
	public ChicagoStylePepperoniPizza(){
		name = "Chicago Style Deep Dish Cheese and Pepperoni Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";

		toppings.add("Shredded mozzarella cheese, Pepperoni");
	}

	void cut(){
		System.out.println("cutting the pizza into square slices");
	}
}
