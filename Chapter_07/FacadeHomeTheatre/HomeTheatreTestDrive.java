public class HomeTheatreTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheatreLights lights = new TheatreLights();
		Screen screen = new Screen();
		PopcornMaker popcornMaker  = new PopcornMaker();

		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, lights, screen, popcornMaker);

		//It is the week before christmas :)
		homeTheatre.watchMovie("Die Hard");
		homeTheatre.endMovie();
	}
}