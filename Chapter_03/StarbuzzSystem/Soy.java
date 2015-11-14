public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Mocha";
	}

	public double cost(){
		return 0.15 + beverage.cost();
	}
}
