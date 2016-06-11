public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = count;

		if(count > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void dispense() {
		state.dispense();
	}


	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comis running out of the slot");
		if (count != 0){
			count = count - 1;
		}
	}

	public State checkState() {
		return this.state;
	}

	public int getCount() {
		return this.count;
	}

	public State getSoldOutState() {
		return this.soldOutState;
	}


	public State getSoldState() {
		return this.soldState;
	}

	public State getHasQuarterState() {
		return this.hasQuarterState;
	}

	public State getNoQuarterState() {
		return this.noQuarterState;
	}

	public State getWinnerState() {
		return this.winnerState;
	}

	public String toString(){
		return "Mighty Gumball, Inc\n" +
				"JAVA machine model NCC1701\n" +
				"Inventory: " + count + " gubmballs\n" +
				checkState();
	}

//refill()
}