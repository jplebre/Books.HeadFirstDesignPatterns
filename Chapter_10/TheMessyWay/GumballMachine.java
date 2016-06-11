public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} 
		else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} 
		else if (state == SOLD) {
			System.out.println("Please wait, we are giving you a gumball");
		}
	}

	public void ejectQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} 
		else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		} 
		else if (state == SOLD) {
			System.out.println("You already turned the crank");
		}
	}

	public void turnCrank() {
		if(state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		} 
		else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You turned but there are no Gumballs");
		} 
		else if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
		}
	}

	public void dispense() {
		if(state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == SOLD) {
			System.out.println("A gumball comis running out of the slot");
			count = count - 1;

			if (count == 0) {
				System.out.println("OOps, out of Gumballs");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		}
	}

	//toString()
	public String toString(){
		return "Mighty Gumball, Inc\n" +
				"JAVA machine model NCC1701\n" +
				"Inventory: " + count + " gubmballs\n" +
				checkState();

		
	}

	private String checkState() {
		if (state == NO_QUARTER) {
			return "Machine is waiting for a quarter";
		} 
		else if (state == SOLD_OUT) {
			return "Machine is sold out";
		}

		return "Error retrieving state";
	}


	//refill()
}