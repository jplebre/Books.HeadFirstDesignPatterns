public class Coffee extends CaffeineBeverage{
	public void brew() {
		System.out.println("Sripping coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}



/*
Original method we needed to refactor:

void prepareRecipe() {
	boilWater();
	brewCoffeeGrinds();         //aka brew
	pourInCup();
	addSugarAndMilk();          //aka add condiments
}

public void boilWater() {
	System.out.println("Boiling water");
}

public void pourInCup() {
	System.out.println("Pouring into Cup");
}

*/