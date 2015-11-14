public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehaviour = new NoFly();
		quackBehaviour = new CanQuack();
	}

	public void Display(){
		System.out.println("I'm a wooden, model duck!");
	}
}
