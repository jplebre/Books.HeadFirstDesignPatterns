import java.util.*;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni
	Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25min at 350");
	}
	
	void cut(){
		System.out.println("Cutting pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName(){
		return name;
	}

	public String toString(){
		//print pizza here
	}
}
