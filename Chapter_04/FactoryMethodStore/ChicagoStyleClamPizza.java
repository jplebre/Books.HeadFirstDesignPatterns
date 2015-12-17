public class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza(){
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";

		toppings.add("Shredded mozzarella cheese, Frozen Clams");
	}

	void cut(){
		System.out.println("cutting the pizza into square slices");
	}
}
