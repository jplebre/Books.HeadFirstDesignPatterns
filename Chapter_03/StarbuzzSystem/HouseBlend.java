public class HouseBlend extends Beverage {
	public HouseBlend(){
		description = "House Blend Coffee";
		size = Beverage.Size.GRANDE;
	}

	public double cost(){
		double cost = 0.0;

		if (getSize() == Beverage.Size.TALL)
			cost = 0.79;
		else if (getSize() == Beverage.Size.GRANDE)
			cost = 0.89;
		else if (getSize() == Beverage.Size.VENTI)
			cost = 0.99;

		return cost;
	}
}
