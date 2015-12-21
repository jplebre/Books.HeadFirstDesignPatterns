public class Amplifier {
	public void on() {
		System.out.println("Turning Loud-O-Matic 4000 On");
	}

	public void off() {
		System.out.println("Turning Loud-O-Matic 4000 Off");
	}

	public void setInput(Object source) {
		System.out.println("Setting Loud-O-Matic 4000 input to " + source);
	}

	public void setSurroundSound() {
		System.out.println("Set Loud-O-Matic 4000 to Dolby Amazing Digital 10.2");
	}

	public void setVolume(int level) {
		System.out.println("Turning sound to: " + level);
	}
}