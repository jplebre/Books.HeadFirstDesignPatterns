public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	//when creating this, a constructort call is necessary
	//it needs to pass as argument which subjects to subscribe to!
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.RegisterObserver(this);
	}

	public void Update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		Display();
	}

	public void Display(){
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
	}
}
