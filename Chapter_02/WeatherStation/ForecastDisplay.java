/* This was written by the authors of Head First Design Patterns
 *
 */

import java.util.*;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.RegisterObserver(this);
	}

	public void Update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		Display();
	}

	public void Display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
