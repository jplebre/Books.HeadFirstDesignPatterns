import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Observable observable;

	//when creating this, a constructort call is necessary
	//it needs to pass as argument which subjects to subscribe to!
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object args) {
		if (obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();

			display();
		}		
		
	}

	public void display(){
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
	}
}
