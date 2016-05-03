import java.util.Iterator;

public class DinerMenu extends Menu {

	public DinerMenu(String name, String description) {
		super(name, description);
		

		addItem("Vegetarian BLT",
				"(Fake) Bacon with lettuce & tomato on whole wheat",
				true,
				2.99);

		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat",
				false,
				2.99);

		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad",
				false,
				3.29);

		addItem("Hotdog",
				"An Hotdog with saurkraut, relish, onions, topped with cheese",
				false,
				3.05);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		this.add(menuItem);
	}
  
	public Iterator<MenuComponent> createIterator() {
		return menuComponents.iterator();
	}
}