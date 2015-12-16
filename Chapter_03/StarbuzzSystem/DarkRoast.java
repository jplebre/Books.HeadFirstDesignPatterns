public class DarkRoast extends Beverage{
	public DarkRoast(){
		description = "Dark Roast Coffee";
		size = Beverage.Size.GRANDE;
	}

	public double cost(){
		double cost = 0.0;
		
		if (getSize() == Beverage.Size.TALL)
			cost = 0.99;
		else if (getSize() == Beverage.Size.GRANDE)
			cost = 1.09;
		else if (getSize() == Beverage.Size.VENTI)
			cost = 1.19;

		return cost;
	}

}
