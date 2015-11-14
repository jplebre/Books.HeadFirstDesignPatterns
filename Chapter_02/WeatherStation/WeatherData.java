import java.util.*;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;

	public void RegisterObserver(Observer o){
		observers.add(o);
	}

	public void RemoveObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) observers.remove(i);
	}

	public void NotifyObservers(){
		for (int i = 0; i < observers.size(); i++){
			observers.get(i).Update(temperature, humidity, pressure);
		}
	}

	public void MeasurementsChanged(){
		NotifyObservers();
	}

	public void SetMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		MeasurementsChanged();
	}

	//other WeatherData methods
}
