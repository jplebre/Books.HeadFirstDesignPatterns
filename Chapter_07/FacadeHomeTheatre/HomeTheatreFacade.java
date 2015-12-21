public class HomeTheatreFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheatreLights lights;
	Screen screen;
	PopcornMaker popcornMaker;

	public HomeTheatreFacade (Amplifier amp,
								Tuner tuner,
								DvdPlayer dvd,
								CdPlayer cd,
								Projector projector,
								TheatreLights lights,
								Screen screen,
								PopcornMaker popcornMaker) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popcornMaker = popcornMaker;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to start watching " + movie);
		popcornMaker.on();
		popcornMaker.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setInput(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);

		System.out.println("\n ------ End Macro ------ \n");
	}

	public void endMovie() {
		System.out.println("Shutting Down...");
		popcornMaker.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();

		System.out.println("\n ------ End Macro ------ \n");
	}
}