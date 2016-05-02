import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class CafeMenu implements Menu {
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

	public CafeMenu() {
		addItem("Veggie burger and air fries",
				"Veggie burger on whole wheat bun, lettuce, tomato, and fries",
				true,
				3.99);

		addItem("Soup of the Day",
				"Cup of soup of the day with side salad",
				false,
				3.69);

		addItem("Burrito",
				"Large burrito with pinto beans, salsa and guacamole",
				true,
				4.29);
	}

	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Map<String, MenuItem> getItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}