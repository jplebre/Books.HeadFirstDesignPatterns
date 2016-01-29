import java.io.*;

public abstract class CaffeineBeverageWithHooks {

	// Base class has the algorithm.
	// Algorithm is unchanged and cannot be modified
	final void prepareRecipe() {
		boilWater();
		brew();                   // Not implemented yet
		pourInCup();

		if (clientWantsCondiments()) {
			addCondiments();          // Not implemented yet
		}
	}


	// Base classes are required to implement details of the algorithm
	abstract void brew();
	abstract void addCondiments();

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void pourInCup() {
		System.out.println("Pouring into Cup");
	}

	public boolean clientWantsCondiments(){
		return false;
	}

	protected String getUserInput(String request) {
		String answer = null;

		System.out.println(request);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = input.readLine();
		} catch (IOException IOException) {
			System.err.println("IO error reading user's input");
		}

		if (answer == null) {
			return "no";
		}

		return answer;
	}
}