import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();

		System.out.println("Menu\n-------\nBreakfast");
		printMenu(pancakeIterator);
		
		System.out.println("Menu\n-------\nDiner");
		printMenu(dinerIterator);

		System.out.println("Menu\n-------\nCafe");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}