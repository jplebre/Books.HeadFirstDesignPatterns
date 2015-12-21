public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck adaptedTurkey = new TurkeyToDuckAdapter(turkey);

		System.out.println("Testing turkey:");
		turkey.gobble();
		turkey.fly();

		System.out.println("Testing duck:");
		duck.quack();
		duck.fly();

		System.out.println("Testing turkey to duck adapter:");
		adaptedTurkey.quack();
		adaptedTurkey.fly();
		
	}
}