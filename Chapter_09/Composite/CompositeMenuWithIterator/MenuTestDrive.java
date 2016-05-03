public class MenuTestDrive {
	public static void main (String args[]) {
		MenuComponent pancakeHouseMenu = new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new DinerMenu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new CafeMenu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desserts");

		MenuComponent allMenus = new Menu("ALL MENUS", "Pancake House Menus");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		// ------------------------------------------------------------------------
		// Example of other operations availabel at this level:

		dinerMenu.add(new MenuItem (
							"Pasta",
							"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
							true,
							3.59)
		);

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem (
							"Apple Pie",
							"Apple pie with flakey crust, topped with Vanilla icecream",
							true,
							1.59)
		);

		// ------------------------------------------------------------------------
		
		Waitress waitress = new Waitress(allMenus);

		waitress.printMenu();

		// ------------------------------------------------------------------------
		// And now for the vegetarian menu!

		waitress.printVegetarianMenu();
	}
}