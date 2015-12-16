public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Whip";
	}

	public double cost(){
		double cost = this.beverage.cost();

		if (beverage.getSize() == Beverage.Size.TALL)
			cost += 0.10;
		else if (beverage.getSize() == Beverage.Size.GRANDE)
			cost += 0.15;
		else if (beverage.getSize() == Beverage.Size.VENTI)
			cost += 0.20;

		return cost;
	}
}
