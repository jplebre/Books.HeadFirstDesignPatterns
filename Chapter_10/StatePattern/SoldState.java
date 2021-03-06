public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we are giving you a gumball");
	}

	public void ejectQuarter() {
		System.out.println("You already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("OOps, out of Gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}