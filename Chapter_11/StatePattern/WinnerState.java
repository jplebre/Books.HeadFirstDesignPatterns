import java.util.Random;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("You are a WINNER!!!! 2 Gumballs for one quarter!!");

		gumballMachine.releaseBall();

		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		else {
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
}