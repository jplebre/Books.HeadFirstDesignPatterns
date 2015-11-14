public abstract class Duck{
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void Display();

	public void PerformFly(){
		flyBehaviour.Fly();
	}
	
	public void PerformQuack(){
		quackBehaviour.Quack();
	}

	public void Swim(){
		System.out.println("All ducks can swim!");
	}

	public void SetFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	public void SetQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;
	}

}
