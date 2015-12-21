public class Tea extends CaffeineBeverage{
	public void brew() {
		System.out.println("Steeping the Tea");
	}

	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}




/*	Original Method that we needed to refactor:

void prepareRecipe() {
	boilWater();
	steepTeaBag();  //aka brew
	addLemon();     //aka add condiments
	pourInCup();
}

public void boilWater() {
	System.out.println("Boiling water");
}

public void pourInCup() {
	System.out.println("Pouring into Cup");
}

*/