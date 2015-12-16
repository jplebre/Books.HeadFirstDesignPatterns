public class Espresso extends Beverage {
	public Espresso(){
		description = "Espresso";
		size = Beverage.Size.GRANDE;
	}

	public double cost(){
		double cost = 0.0;

		if (getSize() == Beverage.Size.TALL)
			cost = 1.89;
		else if (getSize() == Beverage.Size.GRANDE)
			cost = 1.99;
		else if (getSize() == Beverage.Size.VENTI)
			cost = 2.09;
			
		return cost;
	}
}
