public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Soy";
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
