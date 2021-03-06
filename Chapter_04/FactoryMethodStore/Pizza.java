import java.util.*;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare(){
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topings: ");

		for (int i = 0; i < toppings.size(); i++){
			System.out.println("  " + toppings.get(i));
		}
	}

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
}
