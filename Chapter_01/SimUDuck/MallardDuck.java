public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehaviour = new CanQuack();
		flyBehaviour = new CanFly();
	}

	public void Display(){
		System.out.println("I'm a real Mallard Duck!");
	}

}
