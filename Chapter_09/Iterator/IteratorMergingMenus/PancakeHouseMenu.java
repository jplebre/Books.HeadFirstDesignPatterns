import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B's pancake breakfast",
			"Pancakes with scrambled eggs, and toast",
			true,
			2.99);

		addItem("Regular Pancake Breakfast",
			"Pancakes with fried eggs, sausage",
			true,
			3.49);

		addItem("Blueberry Pancakes",
			"Pancakes made with fresh Blueberry",
			true,
			3.49);

		addItem("Waffles",
			"Waffles, with a choice of blueberry or strawberrys",
			true,
			3.49);
	}

	public void addItem(String name,
						String description,
						boolean vegetarian,
						double price)
	{
		MenuItem menuItem = new MenuItem (name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}