public class SimUDuck{
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.PerformQuack();
		mallard.PerformFly();

		Duck model = new ModelDuck();
		model.PerformFly();
		model.SetFlyBehaviour(new FlyRocketPowered());
		model.PerformFly();
	}
}
