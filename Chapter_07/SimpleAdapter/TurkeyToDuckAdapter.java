public class TurkeyToDuckAdapter implements Duck {
	Turkey turkey;

	public TurkeyToDuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack(){
		turkey.gobble();
	}

	public void fly(){
		turkey.fly();
	}

	public void setTurkey(Turkey turkey){
		this.turkey = turkey;
	}
}