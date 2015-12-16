public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Mocha";
	}

	public double cost(){
		double cost = this.beverage.cost();

		if (beverage.getSize() == Beverage.Size.TALL)
			cost += 0.20;
		else if (beverage.getSize() == Beverage.Size.GRANDE)
			cost += 0.25;
		else if (beverage.getSize() == Beverage.Size.VENTI)
			cost += 0.35;

		return cost;
	}
}
