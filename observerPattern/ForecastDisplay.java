public class ForecastDisplay implements Observer, DisplayElement {

	/* class-specific data */
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	/* ForecastDisplay constructor */
	public ForecastDisplay(WeatherData weatherData) {

		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {

		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}

	public void display() {

		/* dependent on the pressure, we can forecast the weather */
		System.out.print("Forecast: ");
		if(currentPressure > lastPressure) {

			System.out.println("Improving weather on the way!");
		}
		else if(currentPressure == lastPressure) {

			System.out.println("More of the same.");
		}
		else if(currentPressure < lastPressure) {

			System.out.println("Watch out for cooler, rainy weather.");
		}
	}
}