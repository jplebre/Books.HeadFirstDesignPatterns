public class DvdPlayer {
	public void on(){
		System.out.println("Turning On Sony RedRay Player");
	}

	public void off(){
		System.out.println("Turning Off Sony RedRay Player");
	}	

	public void play(String movie){
		System.out.println("RedRay is playing " + movie);
	}	

	public void stop(){
		System.out.println("RedRay stopping playback");
	}	

	public void eject(){
		System.out.println("RedRay ejected disc");
	}		
}